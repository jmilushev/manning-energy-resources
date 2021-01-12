package com.milushev.kafka;

import com.milushev.avro.BatteryEvent;
import com.milushev.db.BatteryChargeDao;
import io.confluent.kafka.serializers.AbstractKafkaAvroSerDeConfig;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.ForeachAction;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.log4j.Logger;

import java.util.Properties;

public class BatteryEventConsumerBuilder {
    private static final Logger LOGGER = Logger.getLogger(BatteryEventConsumerBuilder.class);

    private Properties streamsConfiguration = new Properties();
    private BatteryChargeDao dao;

    private String sourceTopicName;

    public  BatteryEventConsumerBuilder withKafkaProperties(final String bootstrapServers,
                                                            final String schemaRegistryUrl,
                                                            final String topicName) {
        this.sourceTopicName = topicName;
        // Give the Streams application a unique name.  The name must be unique in the Kafka cluster
        // against which the application is run.
        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, "battery-event-processor");
        streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, "battery-event-processor-client");
        // Where to find Kafka broker(s).
        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        // Where to find the Confluent schema registry instance(s)
        streamsConfiguration.put(AbstractKafkaAvroSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, schemaRegistryUrl);
        // Specify default (de)serializers for record keys and for record values.
        streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
        streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, SpecificAvroSerde.class);
        streamsConfiguration.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        // Records should be flushed every 10 seconds. This is less than the default
        // in order to keep this example interactive.
        streamsConfiguration.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 10 * 1000);
        return this;
    }

    public BatteryEventConsumerBuilder withDb(final BatteryChargeDao dao){
        this.dao = dao;
        return this;
    }
    public KafkaStreams build(){
        ForeachAction<String, BatteryEvent> eventForeachAction = (key, event) ->
        {
            String eventString = String.format("charging=%d\ncharging source=%s\ndeviceId=%s\ntimestamp=%s",
                    event.getCharging(),
                    event.getChargingSource(),
                    event.getDeviceId(),
                    event.getTimestamp());
            LOGGER.info(eventString);
            dao.insert(event.getDeviceId().toString(),
                       event.getCurrentCapacity());
        };

            StreamsBuilder builder = new StreamsBuilder();
            KStream<String, BatteryEvent> eventFeed = builder
                    .stream(sourceTopicName);
            eventFeed.foreach(eventForeachAction);
            return new KafkaStreams(builder.build(), streamsConfiguration);
        }
}
