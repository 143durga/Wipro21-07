package com.kafkaproducer.service;

import com.kafkaproducer.model.Subject;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    public Subject createSubject(String code, String value) {
        Subject subject = new Subject();
        subject.setSubjectCode(code);
        subject.setSubjectValue(value);
        return subject;
    }
}
