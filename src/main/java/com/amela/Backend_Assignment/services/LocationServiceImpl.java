package com.amela.Backend_Assignment.services;

import com.amela.Backend_Assignment.entities.DTO.LocationDTO;
import com.amela.Backend_Assignment.entities.Location;
import com.amela.Backend_Assignment.mappers.LocationMapper;
import com.amela.Backend_Assignment.repositories.LocationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    private final LocationMapper locationMapper;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository, LocationMapper locationMapper) {
        this.locationRepository = locationRepository;
        this.locationMapper = locationMapper;
    }

    @Override
    public Set<LocationDTO> getLocations() {

        return locationRepository.findAll()
                .stream()
                .map(location -> {
                    LocationDTO locationDTO = locationMapper.locationToLocationDTO(location);

                    return locationDTO;
                })
                .collect(Collectors.toSet());
    }

    @Override
    public Location createLocation(LocationDTO locationDTO) {

        return locationRepository.save(locationMapper.locationDtoToLocation(locationDTO));
    }

    @Override
    public LocationDTO findById(UUID id) {

        return locationRepository.findById(id)
                .map(locationMapper::locationToLocationDTO)
                .orElse(null);
    }

    @Override
    public Location findByName(String name) {

        return locationRepository.findAll()
                .stream()
                .filter(location -> location.getName().contains(name))
                .findAny()
                .orElse(null);
    }

    @Override
    public LocationDTO findByCity(String city) {

        return locationRepository.findAll()
                .stream()
                .filter(location -> location.getCity().getName().equalsIgnoreCase(city))
                .map(location -> locationMapper.locationToLocationDTO(location))
                .findAny()
                .orElse(null);
    }

    @Override
    public LocationDTO updateLocation(UUID id, LocationDTO locationDTO) {

        return locationRepository.findById(id).map(location -> {

            if (locationDTO.getName() != null)
                location.setName(locationDTO.getName());

            if (locationDTO.getAddress() != null)
                location.setAddress(locationDTO.getAddress());

            if (locationDTO.getCity() != null)
                location.setCity(locationDTO.getCity());

            if (locationDTO.getLatitude() != 0)
                location.setLatitude(locationDTO.getLatitude());

            if (locationDTO.getLongitude() != 0)
                location.setLongitude(locationDTO.getLongitude());

            return locationMapper.locationToLocationDTO(locationRepository.save(location));

        }).orElse(null);
    }

    @Override
    public void deleteById(UUID id) {

        locationRepository.deleteById(id);
    }
}
