package com.Cattlemanagment.Cattlemanagment.service;

import com.Cattlemanagment.Cattlemanagment.entity.Animal;
import com.Cattlemanagment.Cattlemanagment.repository.AnimalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public Optional<Animal> getAnimalById(Long id) {
        return animalRepository.findById(id);
    }

    public Animal addAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public Animal updateAnimal(Long id, Animal animalDetails) {
        Animal animal = animalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Animal non trouvé avec id : " + id));

        animal.setName(animalDetails.getName());
        animal.setType(animalDetails.getType());
        animal.setBirthDate(animalDetails.getBirthDate());
        animal.setGender(animalDetails.getGender());
        animal.setBreed(animalDetails.getBreed());
        animal.setStatus(animalDetails.getStatus());

        return animalRepository.save(animal);
    }

    public void deleteAnimal(Long id) {
        Animal animal = animalRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Animal non trouvé avec id : " + id));

        animalRepository.delete(animal);
    }
}
