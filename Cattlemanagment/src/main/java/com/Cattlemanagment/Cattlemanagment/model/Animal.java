package com.Cattlemanagment.Cattlemanagment.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String race;
    private String sexe;
    private LocalDate dateNaissance;
    private Double poids;
    private Double temperature;
    private String statutSante;
}
