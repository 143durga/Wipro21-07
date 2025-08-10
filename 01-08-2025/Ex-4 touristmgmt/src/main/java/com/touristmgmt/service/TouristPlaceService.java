package com.touristmgmt.service;

import com.touristmgmt.model.TouristPlace;
import com.touristmgmt.repository.TouristPlaceRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TouristPlaceService {

    private final TouristPlaceRepository repository;

    public TouristPlaceService(TouristPlaceRepository repository) {
        this.repository = repository;
    }

    public TouristPlace addPlace(TouristPlace place) {
        return repository.save(place);
    }

    public List<TouristPlace> getAllPlaces() {
        return repository.findAll();
    }

    public Optional<TouristPlace> getPlaceById(int id) {
        return repository.findById(id);
    }

    public TouristPlace updatePlace(int id, TouristPlace updatedPlace) {
        return repository.findById(id).map(place -> {
            place.setName(updatedPlace.getName());
            place.setType(updatedPlace.getType());
            place.setState(updatedPlace.getState());
            place.setProductMake(updatedPlace.getProductMake());
            place.setProductPrice(updatedPlace.getProductPrice());
            return repository.save(place);
        }).orElse(null);
    }

    public boolean deletePlace(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<TouristPlace> getPlacesByProductMake(String productMake) {
        return repository.findByProductMake(productMake);
    }

    public List<TouristPlace> getPlacesByState(String state) {
        return repository.findByState(state);
    }

    public List<TouristPlace> getPlacesByTypeSortedDesc(String type) {
        return repository.findByTypeOrderByNameDesc(type);
    }

    public List<TouristPlace> getPlacesByTypeAndStateSortedDesc(String type, String state) {
        return repository.findByTypeAndStateOrderByNameDesc(type, state);
    }

    public Page<TouristPlace> getPlacesSortedByProductPrice(int page, int size, boolean descending) {
        Sort sort = Sort.by("productPrice");
        sort = descending ? sort.descending() : sort.ascending();
        PageRequest pageRequest = PageRequest.of(page, size, sort);
        return repository.findAll(pageRequest);
    }
}
