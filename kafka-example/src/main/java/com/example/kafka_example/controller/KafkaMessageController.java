package com.example.kafka_example.controller;

import com.example.kafka_example.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaMessageController {

    @Autowired
    private MessageProducer producer;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String key, @RequestParam String message) {
        producer.sendMessage(key, message);
        return "Message sent!";
    }
}
