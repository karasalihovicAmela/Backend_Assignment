package com.amela.Backend_Assignment.entities;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Location {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String address;

    @ManyToOne(cascade=CascadeType.ALL)
    private City city;

    private double longitude;

    private double latitude;

}
