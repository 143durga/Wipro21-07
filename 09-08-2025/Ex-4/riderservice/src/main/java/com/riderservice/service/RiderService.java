package com.riderservice.service;

import com.riderservice.model.RideRequest;
import com.riderservice.model.RideStatus;
import com.riderservice.repository.RideRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RiderService {

    private final RideRequestRepository repository;
    private final KafkaTemplate<String, RideRequest> kafkaTemplate;

    @Value("${app.topic.r2u}")
    private String r2uTopic;

    public RideRequest createRideRequest(RideRequest request) {
        request.setStatus(RideStatus.REQUESTED);
        RideRequest saved = repository.save(request);

        kafkaTemplate.send(r2uTopic, saved);
        return saved;
    }
}
