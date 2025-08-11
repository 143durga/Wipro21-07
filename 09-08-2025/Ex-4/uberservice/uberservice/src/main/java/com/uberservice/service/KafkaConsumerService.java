package com.uberservice.service;

import com.uberservice.model.RideRequest;
import com.uberservice.model.RideStatus;
import com.uberservice.repository.RideRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    private final RideRequestRepository repository;
    private final KafkaTemplate<String, RideRequest> kafkaTemplate;

    @Value("${app.topic.u2r}")
    private String u2rTopic;

    @KafkaListener(topics = "${app.topic.r2u}", groupId = "uber-group")
    public void consumeRideRequest(RideRequest rideRequest) {
        // Save incoming ride request with status REQUESTED
        rideRequest.setStatus(RideStatus.ACCEPTED); // Simulate accepting the ride
        RideRequest saved = repository.save(rideRequest);

        // Send updated ride back to RiderService
        kafkaTemplate.send(u2rTopic, saved);

        System.out.println("Processed and accepted ride request: " + saved);
    }
}
