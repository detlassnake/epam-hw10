package ua.epam.hw10.structuralPatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Pets {
    private List<Animal> animals = new ArrayList<Animal>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void createHouse() {
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
}
