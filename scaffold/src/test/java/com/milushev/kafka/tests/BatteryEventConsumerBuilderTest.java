package com.milushev.kafka.tests;

import com.milushev.kafka.BatteryEventConsumerBuilder;
import org.apache.kafka.streams.KafkaStreams;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Properties;

import static org.junit.Assert.*;

public class BatteryEventConsumerBuilderTest {

    @Ignore
    @Test
    public void test1Test() throws InterruptedException {
        BatteryEventConsumerBuilder builder = new BatteryEventConsumerBuilder();
        KafkaStreams batteryMeasurementStream = builder
                .withKafkaProperties("localhost:29092",
                        "http://localhost:8090",
                        "battery_measurement")
                .build();

        batteryMeasurementStream.start();
        Thread.sleep(30000);
    }

}