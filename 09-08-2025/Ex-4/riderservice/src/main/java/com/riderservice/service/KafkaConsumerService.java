package com.riderservice.service;

import com.riderservice.model.RideRequest;
import com.riderservice.repository.RideRequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaConsumerService {

    private final RideRequestRepository repository;

    @KafkaListener(topics = "${app.topic.u2r}", groupId = "rider-group", containerFactory = "kafkaListenerContainerFactory")
    public void consumeRideUpdate(RideRequest updatedRide) {
        repository.findById(updatedRide.getId()).ifPresent(existing -> {
            existing.setStatus(updatedRide.getStatus());
            repository.save(existing);
            System.out.println("Ride updated: " + updatedRide);
        });
    }
    @KafkaListener(topics = "${app.topic.r2u}", groupId = "rider-group", containerFactory = "kafkaListenerContainerFactory")
    public void consumeNewRideRequest(RideRequest newRide) {
        System.out.println("Received new ride request: " + newRide);
        repository.save(newRide);
        System.out.println("Saved new ride request: " + newRide);
    }
}
