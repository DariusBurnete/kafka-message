package com.example.kafka_example;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTestConsumer {

    @KafkaListener(topics = "string_topic", groupId = "test-group")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.printf("Received message: '%s' | Offset: %d | Partition: %d | Key: %s | Topic: %s%n",
                record.value(), record.offset(), record.partition(), record.key(), record.topic());
    }
}
