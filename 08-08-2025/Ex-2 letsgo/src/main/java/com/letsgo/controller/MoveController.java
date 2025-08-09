package com.letsgo.controller;

import com.letsgo.entity.VehicleMovement;
import com.letsgo.repository.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MoveController {

    @Autowired
    private VehicleMovementRepository repository;

    @PostMapping("/move")
    public String moveVehicle(@RequestBody VehicleMovement movement) {
        repository.save(movement);
        return "Vehicle movement saved successfully!";
    }
}
