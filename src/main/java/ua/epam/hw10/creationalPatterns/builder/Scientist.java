package ua.epam.hw10.creationalPatterns.builder;

public class Scientist {
    AnimalBuilder builder;

    public void setBuilder(AnimalBuilder builder) {
        this.builder = builder;
    }

    Animal buildAnimal() {
        builder.createAnimal();
        builder.buildName();
        builder.buildWeight();
        builder.buildAge();

        Animal animal = builder.getAnimal();

        return animal;
    }
}
