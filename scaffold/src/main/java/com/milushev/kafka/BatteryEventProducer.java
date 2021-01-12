package com.milushev.kafka;

import com.milushev.avro.BatteryEvent;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.SerializationException;

import java.util.Properties;
import java.util.concurrent.Future;

public class BatteryEventProducer {
    private KafkaProducer producer;
    private String topic;
    public BatteryEventProducer(String bootstrapServers, String schemaRegistryUrl, String topicName) {
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                io.confluent.kafka.serializers.KafkaAvroSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                io.confluent.kafka.serializers.KafkaAvroSerializer.class);
        props.put("schema.registry.url", schemaRegistryUrl);
        producer = new KafkaProducer(props);
        this.topic = topicName;
    }

    public void post(String key, BatteryEvent record) throws SerializationException{
        ProducerRecord<Object, Object> rec = new ProducerRecord<>(topic, key, record);
        producer.send(rec);
        producer.flush();
    }
}
