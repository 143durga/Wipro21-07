package com.kafkaconsumer.service;
import com.kafkaconsumer.model.Subject;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {
	public void processSubject(Subject subject) {
        System.out.println("Processing subject: " + subject.getSubjectCode() + " - " + subject.getSubjectValue());
    }
}
