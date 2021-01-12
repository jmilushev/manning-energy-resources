package com.milushev.kafka;

import com.milushev.IngestConfiguration;
import com.milushev.db.BatteryChargeDao;
import io.dropwizard.lifecycle.Managed;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.log4j.Logger;

import static java.lang.Thread.sleep;

public class KafkaStreamManager implements Managed, Runnable{
    private static final Logger LOGGER = Logger.getLogger(KafkaStreamManager.class);
    private KafkaStreams stream;
    private IngestConfiguration config;
    private BatteryChargeDao dao;
    private boolean isRunning = false;

    private synchronized boolean getRunning() {
        return isRunning;
    }

    private synchronized void setRunning(boolean running) {
        this.isRunning = running;
    }


    public KafkaStreamManager(IngestConfiguration conf, BatteryChargeDao dao) {
        this.config = conf;
        this.dao = dao;
    }

    @Override
    public void start() throws Exception {
        LOGGER.info(String.format("Entered the KafkaStream start"));
        Thread thread = new Thread(this, "Kafka Stream Processor");
        setRunning(true);
        thread.start();
    }

    @Override
    public void stop() throws Exception {
        setRunning(true);
    }

    @Override
    public void run() {
        BatteryEventConsumerBuilder builder = new BatteryEventConsumerBuilder();
        stream = builder
                .withKafkaProperties(config.getKafkaBroker(),
                        config.getSchemaRegistryUrl(),
                        config.getBatteryEventTopic())
                .withDb(dao)
                .build();
        stream.start();
        LOGGER.info("Started the Kafka Stream consumer");
        isRunning = true;
        while(getRunning()) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
            }
        }
        stream.close();
    }
}
