
package com.Cattlemanagment.Cattlemanagment.controller;


import com.Cattlemanagment.Cattlemanagment.model.Animal;
import com.Cattlemanagment.Cattlemanagment.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animaux")
@CrossOrigin(origins = "*")
public class AnimalController {

    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Animal getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Animal create(@RequestBody Animal animal) {
        return service.save(animal);
    }

    @PutMapping("/{id}")
    public Animal update(@PathVariable Long id, @RequestBody Animal updated) {
        Animal existing = service.findById(id);
        if (existing != null) {
            updated.setId(id);
            return service.save(updated);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
