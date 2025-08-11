package com.uberservice.controller;

import com.uberservice.model.RideRequest;
import com.uberservice.model.RideStatus;
import com.uberservice.repository.RideRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RideController {

    @Autowired
    private RideRequestRepository rideRequestRepository;

    @PostMapping("/bookRide")
    public RideRequest bookRide(@RequestBody RideRequest rideRequest) {
        rideRequest.setStatus(RideStatus.REQUESTED);
        return rideRequestRepository.save(rideRequest);
    }
}
