
package com.Cattlemanagment.Cattlemanagment.repository;



import com.Cattlemanagment.Cattlemanagment.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
