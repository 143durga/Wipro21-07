package com.touristmgmt.controller;

import com.touristmgmt.model.TouristPlace;
import com.touristmgmt.service.TouristPlaceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "TouristPlace", description = "Tourist Place Management APIs")
@RestController
@RequestMapping("/api/places")
public class TouristPlaceController {

    private final TouristPlaceService service;

    public TouristPlaceController(TouristPlaceService service) {
        this.service = service;
    }

    @Operation(summary = "Add a new tourist place")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Tourist place added successfully"),
        @ApiResponse(responseCode = "400", description = "Invalid input")
    })
    @PostMapping
    public TouristPlace add(@RequestBody TouristPlace place) {
        return service.addPlace(place);
    }

    @Operation(summary = "Get all tourist places")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Successfully retrieved list")
    })
    @GetMapping
    public List<TouristPlace> list() {
        return service.getAllPlaces();
    }

    @Operation(summary = "Get a tourist place by ID")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Tourist place found"),
        @ApiResponse(responseCode = "404", description = "Tourist place not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<TouristPlace> getById(@PathVariable int id) {
        return service.getPlaceById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Update a tourist place")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Tourist place updated"),
        @ApiResponse(responseCode = "404", description = "Tourist place not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<TouristPlace> update(@PathVariable int id, @RequestBody TouristPlace place) {
        TouristPlace updated = service.updatePlace(id, place);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Delete a tourist place")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Tourist place deleted"),
        @ApiResponse(responseCode = "404", description = "Tourist place not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        return service.deletePlace(id) ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }

    @Operation(summary = "Get places by product make")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "List of places with the given product make")
    })
    @GetMapping("/make/{make}")
    public List<TouristPlace> getByProductMake(@PathVariable String make) {
        return service.getPlacesByProductMake(make);
    }

    @Operation(summary = "Get places by state")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "List of places in the given state")
    })
    @GetMapping("/state/{state}")
    public List<TouristPlace> getByState(@PathVariable String state) {
        return service.getPlacesByState(state);
    }

    @Operation(summary = "Get places by type, sorted by name descending")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "List of places by type sorted by name desc")
    })
    @GetMapping("/type/{type}/sorted")
    public List<TouristPlace> getByTypeSortedDesc(@PathVariable String type) {
        return service.getPlacesByTypeSortedDesc(type);
    }

    @Operation(summary = "Get places by type and state, sorted by name descending")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "List of places by type and state sorted by name desc")
    })
    @GetMapping("/type/{type}/state/{state}/sorted")
    public List<TouristPlace> getByTypeAndStateSortedDesc(@PathVariable String type, @PathVariable String state) {
        return service.getPlacesByTypeAndStateSortedDesc(type, state);
    }

    @Operation(summary = "Get paginated and sorted places by product price")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Paginated list sorted by product price")
    })
    @GetMapping("/page")
    public Page<TouristPlace> getPaginatedAndSortedPlaces(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @RequestParam(defaultValue = "asc") String sortDir
    ) {
        boolean descending = sortDir.equalsIgnoreCase("desc");
        return service.getPlacesSortedByProductPrice(page, size, descending);
    }
}
