package com.touristmgmt.repository;

import com.touristmgmt.model.TouristPlace;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TouristPlaceRepository extends JpaRepository<TouristPlace, Integer> {
    List<TouristPlace> findByProductMake(String productMake);
    List<TouristPlace> findByState(String state);
    List<TouristPlace> findByTypeOrderByNameDesc(String type);
    List<TouristPlace> findByTypeAndStateOrderByNameDesc(String type, String state);

    // For pagination
    Page<TouristPlace> findAll(Pageable pageable);
}
