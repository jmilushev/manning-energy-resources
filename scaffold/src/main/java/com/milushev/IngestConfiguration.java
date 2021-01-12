package com.milushev;
import com.milushev.db.BatteryChargeDao;
import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.db.DataSourceFactory;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class IngestConfiguration extends Configuration {
    @NotEmpty
    private String kafkaBroker;

    @NotEmpty
    private String schemaRegistryUrl;

    @NotEmpty
    private String batteryEventTopic;

    @Valid
    @NotNull
    private DataSourceFactory database = new DataSourceFactory();

    public BatteryChargeDao getBatteryChargeDao() {
        return batteryChargeDao;
    }

    public void setBatteryChargeDao(BatteryChargeDao batteryChargeDao) {
        this.batteryChargeDao = batteryChargeDao;
    }

    private BatteryChargeDao batteryChargeDao;

    public String getBatteryEventTopic() {
        return batteryEventTopic;
    }

    public String getSchemaRegistryUrl() {
        return schemaRegistryUrl;
    }

    @JsonProperty
    public String getKafkaBroker() {
        return kafkaBroker;
    }

    @JsonProperty
    public void setKafkaBroker(String kafkaBroker) {
        this.kafkaBroker = kafkaBroker;
    }

    @JsonProperty("database")
    public void setDataSourceFactory(DataSourceFactory factory) {
        this.database = factory;
    }

    @JsonProperty("database")
    public DataSourceFactory getDataSourceFactory() {
        return database;
    }



}
