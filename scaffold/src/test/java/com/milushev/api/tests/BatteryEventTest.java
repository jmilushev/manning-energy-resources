package com.milushev.api.tests;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.milushev.api.BatteryEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BatteryEventTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void whenValidJson_parsedOK() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        BatteryEvent batteryEvent = mapper.readValue("{\n" +
                "        \"charging\": 512,\n" +
                "        \"charging_source\": \"utility\",\n" +
                "        \"current_capacity\": 11000,\n" +
                "        \"moduleL_temp\": 0,\n" +
                "        \"moduleR_temp\": 10,\n" +
                "        \"processor1_temp\": 110,\n" +
                "        \"processor2_temp\": 120,\n" +
                "        \"processor3_temp\": 130,\n" +
                "        \"processor4_temp\": 140,\n" +
                "        \"inverter_state\": 3,\n" +
                "        \"device_id\": \"ce918ac0-7a51-422f-813d-04d531c91ee3\",\n" +
                "        \"SoC_regulator\": 28.1\n" +
                "}", BatteryEvent.class);

        assertEquals(512, batteryEvent.getCharging());
        assertEquals("utility", batteryEvent.getChargingSource());
        assertEquals("ce918ac0-7a51-422f-813d-04d531c91ee3", batteryEvent.getDeviceId());
        assertEquals(11000, batteryEvent.getCurrentCapacity());
        assertEquals(0, batteryEvent.getModuleLTemp());
        assertEquals(10, batteryEvent.getModuleRTemp());
        assertEquals(110, batteryEvent.getProcessor1Temp());
        assertEquals(120, batteryEvent.getProcessor2Temp());
        assertEquals(130, batteryEvent.getProcessor3Temp());
        assertEquals(140, batteryEvent.getProcessor4Temp());
        assertEquals(3, batteryEvent.getInverterState());
        assertEquals(28.1, batteryEvent.getSoCRegulator(), 0.001);

    }

    @Test
    public void whenMissingFields_useDefaultValues() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        BatteryEvent batteryEvent = mapper.readValue("{\n" +
                "        \"charging\": 512,\n" +
                "        \"charging_source\": \"utility\",\n" +
                "        \"current_capacity\": 11000\n" +
                "}", BatteryEvent.class);

        assertEquals(512, batteryEvent.getCharging());
        assertEquals("utility", batteryEvent.getChargingSource());
        assertEquals(11000, batteryEvent.getCurrentCapacity());
        assertEquals(0, batteryEvent.getModuleLTemp());
        assertEquals(0, batteryEvent.getModuleRTemp());
        assertEquals(0, batteryEvent.getProcessor1Temp());
        assertEquals(0, batteryEvent.getProcessor2Temp());
        assertEquals(0, batteryEvent.getProcessor3Temp());
        assertEquals(0, batteryEvent.getProcessor4Temp());
        assertEquals(0, batteryEvent.getInverterState());
        assertEquals(0.0, batteryEvent.getSoCRegulator(), 0.001);

    }

}

