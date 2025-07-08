package com.example.kafka_example;

import com.example.kafka_example.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaExampleApplication implements CommandLineRunner {

	@Autowired
	private MessageProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(KafkaExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		producer.sendMessage("myKey", "Message from Spring Boot Kafka Producer");
	}

}
