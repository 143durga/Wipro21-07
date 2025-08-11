package com.riderservice.controller;

import com.riderservice.model.RideRequest;
import com.riderservice.model.RideStatus;
import com.riderservice.repository.RideRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rides")
public class RiderController {

    @Autowired
    private RideRequestRepository rideRequestRepository;

    @PostMapping("/bookRide")
    public RideRequest bookRide(@RequestBody RideRequest rideRequest) {
        rideRequest.setStatus(RideStatus.REQUESTED);
        return rideRequestRepository.save(rideRequest);
    }

    @GetMapping("/test")
    public String test() {
        return "Rider Service is UP!";
    }
}
