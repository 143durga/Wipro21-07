package com.letsgo.repository;

import com.letsgo.entity.VehicleMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleMovementRepository extends JpaRepository<VehicleMovement, Long> {
}
