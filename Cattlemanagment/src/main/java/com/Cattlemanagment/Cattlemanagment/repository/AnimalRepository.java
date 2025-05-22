package com.Cattlemanagment.Cattlemanagment.repository;

import com.Cattlemanagment.Cattlemanagment.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    // Ajoute des méthodes spécifiques si nécessaire
}
