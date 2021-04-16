package com.amela.Backend_Assignment.services;

import com.amela.Backend_Assignment.entities.DTO.LocationDTO;
import com.amela.Backend_Assignment.entities.Location;

import java.util.Set;
import java.util.UUID;

public interface LocationService {

    Set<LocationDTO> getLocations();

    Location createLocation(LocationDTO locationDTO);

    LocationDTO findById(UUID id);

    Location findByName(String name);

    LocationDTO findByCity(String city);

    LocationDTO updateLocation(UUID id,LocationDTO locationDTO);

    void deleteById(UUID id);
}
