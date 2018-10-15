package ee.ut.loomadevp.controller;

import ee.ut.loomadevp.model.Animal;
import ee.ut.loomadevp.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AvalduseRestController {
    @Autowired
    private AnimalRepository animalRepository;

    @PostMapping("/viiols/save")
    public Animal postProduct(@RequestBody Animal animal) {
        animalRepository.addAnimal(animal.getLiik(), animal.getVanus(), animal.getLinn());

        return animal;
    }
}