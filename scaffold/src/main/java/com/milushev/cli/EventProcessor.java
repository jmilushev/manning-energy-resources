package com.milushev.cli;

import com.milushev.IngestConfiguration;
import com.milushev.db.BatteryChargeDao;
import com.milushev.kafka.BatteryEventConsumerBuilder;
import com.milushev.resources.BatteryEventResource;
import io.dropwizard.cli.ConfiguredCommand;
import io.dropwizard.jdbi3.JdbiFactory;
import io.dropwizard.setup.Bootstrap;
import net.sourceforge.argparse4j.inf.Namespace;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.log4j.Logger;
import org.jdbi.v3.core.Jdbi;

public class EventProcessor extends ConfiguredCommand<IngestConfiguration> {

    private static final Logger LOGGER = Logger.getLogger(EventProcessor.class);

    public EventProcessor() {
        super("BatteryEventStreamProcessor",
              "processes the stream of Battery events and saves them to a database");
    }


    @Override
    protected void run(Bootstrap<IngestConfiguration> bootstrap,
                       Namespace namespace,
                       IngestConfiguration ingestConfig) throws Exception {
        //configure the stream and start processing

        LOGGER.info(String.format("Entered the EventProcessor Command and Kafka %s", ingestConfig.getKafkaBroker()));
        BatteryEventConsumerBuilder builder = new BatteryEventConsumerBuilder();
        KafkaStreams stream = builder
                                    .withKafkaProperties(ingestConfig.getKafkaBroker(),
                                                        ingestConfig.getSchemaRegistryUrl(),
                                                        ingestConfig.getBatteryEventTopic())
                                    .withDb(ingestConfig.getBatteryChargeDao())
                                    .build();
        stream.start();
        LOGGER.info("Started the Kafka Stream consumer");
        Thread.sleep(3600_000);
    }
}