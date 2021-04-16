package com.amela.Backend_Assignment.entities.DTO;

import com.amela.Backend_Assignment.entities.City;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class LocationDTO {

    private String name;

    private String address;

    private City city;

    private double longitude;

    private double latitude;
}
