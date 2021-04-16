package com.amela.Backend_Assignment.controllers;

import com.amela.Backend_Assignment.entities.DTO.LocationDTO;
import com.amela.Backend_Assignment.entities.Location;
import com.amela.Backend_Assignment.services.LocationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@Slf4j
@RequestMapping("location")
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping
    public Set<LocationDTO> showLocations(){

        return locationService.getLocations();
    }

    @PostMapping
    public Location createLocation(@RequestBody LocationDTO locationDTO){

        return locationService.createLocation(locationDTO);
    }

    @GetMapping("/name/{name}")
    public Location findLocationByName(@PathVariable("name") String name){

        return locationService.findByName(name);
    }

    @GetMapping("/city/{city}")
    public LocationDTO findLocationByCity(@PathVariable("city") String city){

        return locationService.findByCity(city);
    }

    @GetMapping("/{id}")
    public LocationDTO findLocationById(@PathVariable("id") UUID id){

        return locationService.findById(id);
    }

    @PutMapping("/{id}")
    public LocationDTO updateLocation(@PathVariable UUID id, @RequestBody LocationDTO locationDTO){

        return locationService.updateLocation(id, locationDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id){

        locationService.deleteById(id);
    }

}
