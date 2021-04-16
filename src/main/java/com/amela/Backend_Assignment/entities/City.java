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
public class City {

    @Id
    @GeneratedValue
    private UUID id;

    private String name;
}
