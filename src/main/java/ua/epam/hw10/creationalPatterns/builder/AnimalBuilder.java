package ua.epam.hw10.creationalPatterns.builder;

public abstract class AnimalBuilder {
    Animal animal;

    void createAnimal() {
        animal = new Animal();
    }

    abstract void buildName();

    abstract void buildWeight();

    abstract void buildAge();

    Animal getAnimal() {
        return animal;
    }
}
