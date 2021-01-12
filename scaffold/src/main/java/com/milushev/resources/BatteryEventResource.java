package com.milushev.resources;
import com.milushev.api.BatteryEvent;
import com.codahale.metrics.annotation.Timed;
import com.milushev.db.BatteryChargeDao;
import com.milushev.kafka.BatteryEventProducer;
import org.apache.log4j.Logger;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/battery-event")
@Produces(MediaType.APPLICATION_JSON)
public class BatteryEventResource {
    private final BatteryEventProducer producer;
    private final AtomicLong counter;
    private final BatteryChargeDao batteryChargeDao;
    final private static long MAX_CAPACITY = 13_000;

    private static final Logger LOGGER = Logger.getLogger(BatteryEventResource.class);

    public BatteryEventResource(BatteryEventProducer producer, BatteryChargeDao batteryChargeDao) {
        this.producer = producer;
        this.batteryChargeDao = batteryChargeDao;
        this.counter = new AtomicLong();
    }

    @POST
    @Path("/{id}")
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String postEvent(@PathParam("id") String id, BatteryEvent event) {
        LOGGER.info(String.format("id: %s, source: %s", id, event.getChargingSource()));
        com.milushev.avro.BatteryEvent avroRecord = event.toAvro("");
        producer.post(event.getDeviceId(), avroRecord);
        return "OK";
    }

    @GET
    @Path("/{id}")
    @Timed
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getBatteryCharge(@PathParam("id") String id) {
        LOGGER.info(String.format("device_id: %s", id));
        Long charge = batteryChargeDao.getCapacityByDeviceId(id);
        LOGGER.info(String.format("device_id: %s, charge: %d", id, charge));
        Long soc = charge / MAX_CAPACITY;
        if (soc == 1)
            return "Charged" ;
        else if (charge == 0)
            return "Not charged";
        else
            return "Charging";
    }

}

