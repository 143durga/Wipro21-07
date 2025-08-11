package com.uberservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pickupLocation;
    private String dropLocation;

    @Enumerated(EnumType.STRING)
    private RideStatus status;

    private String userId;
    private String driverId; // can be null initially
}
