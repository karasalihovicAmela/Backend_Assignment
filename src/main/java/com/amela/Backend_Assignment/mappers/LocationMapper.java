package com.amela.Backend_Assignment.mappers;

import com.amela.Backend_Assignment.entities.DTO.LocationDTO;
import com.amela.Backend_Assignment.entities.Location;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class LocationMapper {

    public LocationDTO locationToLocationDTO(Location location){

        return LocationDTO.builder()
                .name(location.getName())
                .address(location.getAddress())
                .city(location.getCity())
                .latitude(location.getLatitude())
                .longitude(location.getLongitude())
                .build();
    }

    public Location locationDtoToLocation(LocationDTO locationDTO){

        return Location.builder()
                .id(UUID.randomUUID())
                .name(locationDTO.getName())
                .address(locationDTO.getAddress())
                .city(locationDTO.getCity())
                .latitude(locationDTO.getLatitude())
                .longitude(locationDTO.getLongitude())
                .build();
    }
}
