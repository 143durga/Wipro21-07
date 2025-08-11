package com.kafkaproducer.controller;

import com.kafkaproducer.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produce")
public class ProducerController {

    private static final String TOPIC = "learn-subject";

    @Autowired
    private KafkaTemplate<String, Subject> kafkaTemplate;

    @PostMapping
    public String sendMessage(@RequestBody Subject subject) {
        kafkaTemplate.send(TOPIC, subject);
        return "Message sent successfully!";
    }
}