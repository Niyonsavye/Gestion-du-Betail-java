

package com.Cattlemanagment.Cattlemanagment.service;



import com.Cattlemanagment.Cattlemanagment.model.Animal;
import com.Cattlemanagment.Cattlemanagment.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> findAll() {
        return repository.findAll();
    }

    public Animal findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Animal save(Animal animal) {
        return repository.save(animal);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

