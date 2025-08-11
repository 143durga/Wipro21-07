package com.riderservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ride_request") // match your DB table name exactly
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pickup_location")  // exact column name in DB
    private String pickupLocation;

    @Column(name = "drop_location")
    private String dropLocation;

    @Enumerated(EnumType.STRING)
    private RideStatus status;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "driver_id")
    private String driverId;
}
