package com.kafkaconsumer.listener;

import com.kafkaconsumer.model.Subject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @KafkaListener(topics = "learn-subject", groupId = "subject-group", containerFactory = "subjectKafkaListenerFactory")
    public void consume(Subject subject) {
        System.out.println("Received Subject: " + subject.getSubjectCode() + " - " + subject.getSubjectValue());
    }
}
