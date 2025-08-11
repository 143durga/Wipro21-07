package com.uberservice.service;

import com.uberservice.model.RideRequest;
import com.uberservice.model.RideStatus;
import com.uberservice.repository.RideRequestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RideRequestConsumer {

    private final RideRequestRepository rideRequestRepository;

    // no containerFactory specified — uses default kafkaListenerContainerFactory
    @KafkaListener(topics = "${app.topic.r2u}", groupId = "uber-group")
    public void consumeRideRequest(RideRequest rideRequest) {
        log.info("Received ride request from Kafka: {}", rideRequest);

        // set a default status if not present
        if (rideRequest.getStatus() == null) {
            rideRequest.setStatus(RideStatus.ACCEPTED); // or REQUESTED depending on your flow
        }

        RideRequest saved = rideRequestRepository.save(rideRequest);
        log.info("Saved RideRequest id={} status={}", saved.getId(), saved.getStatus());
    }
}
