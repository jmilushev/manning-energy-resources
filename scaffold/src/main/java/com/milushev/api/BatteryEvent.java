package com.milushev.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BatteryEvent {


    private long charging;
    private String chargingSource;
    private long currentCapacity;

    private String deviceId;
    private long moduleLTemp;


    private long moduleRTemp;
    private long processor1Temp;
    private long processor2Temp;
    private long processor3Temp;
    private long processor4Temp;
    private long inverterState;
    private float soCRegulator;



    public BatteryEvent() {
        // Jackson deserialization
    }

    public BatteryEvent(long charging, String charging_source, long current_capacity, long moduleL_temp,
                        long moduleR_temp, long processor1_temp, long processor2_temp, long processor3_temp,
                        long processor4_temp, long inverter_state, float soC_regulator, String device_id) {
        this.charging = charging;
        this.chargingSource = charging_source;
        this.currentCapacity = current_capacity;
        this.moduleLTemp = moduleL_temp;
        this.moduleRTemp = moduleR_temp;
        this.processor1Temp = processor1_temp;
        this.processor2Temp = processor2_temp;
        this.processor3Temp = processor3_temp;
        this.processor4Temp = processor4_temp;
        this.inverterState = inverter_state;
        this.soCRegulator = soC_regulator;
        this.deviceId = device_id;
    }

    @JsonProperty
    public long getCharging() {
        return charging;
    }

    @JsonProperty
    @JsonAlias("charging_source")
    public String getChargingSource() {
        return chargingSource;
    }

    @JsonProperty
    @JsonAlias("current_capacity")
    public long getCurrentCapacity() {
        return currentCapacity;
    }

    @JsonProperty
    @JsonAlias("moduleL_temp")
    public long getModuleLTemp() {
        return moduleLTemp;
    }

    @JsonProperty
    @JsonAlias("moduleR_temp")
    public long getModuleRTemp() {
        return moduleRTemp;
    }

    @JsonProperty
    @JsonAlias("processor1_temp")
    public long getProcessor1Temp() {
        return processor1Temp;
    }

    @JsonProperty
    @JsonAlias("processor2_temp")
   public long getProcessor2Temp() {
        return processor2Temp;
    }

    @JsonProperty
    @JsonAlias("processor3_temp")
    public long getProcessor3Temp() {
        return processor3Temp;
    }

    @JsonProperty
    @JsonAlias("processor4_temp")
    public long getProcessor4Temp() {
        return processor4Temp;
    }

    @JsonProperty
    @JsonAlias("inverter_state")
    public long getInverterState() {
        return inverterState;
    }

    @JsonProperty
    @JsonAlias("SoC_regulator")
    public float getSoCRegulator() {
        return soCRegulator;
    }

    @JsonProperty("device_id")
    public String getDeviceId() {
        return deviceId;
    }

    public com.milushev.avro.BatteryEvent toAvro(String timestamp) {
        return new com.milushev.avro.BatteryEvent(
                this.deviceId, this.charging, timestamp, this.chargingSource, this.currentCapacity,
                this.moduleLTemp, this.moduleRTemp, this.processor1Temp, this.processor2Temp,
                this.processor3Temp, this.processor4Temp, this.inverterState, this.soCRegulator
        );
    }
}
