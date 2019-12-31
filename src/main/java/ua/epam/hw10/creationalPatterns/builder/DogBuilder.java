package ua.epam.hw10.creationalPatterns.builder;

public class DogBuilder extends AnimalBuilder {
    @Override
    void buildName() {
        animal.setName("DogName");
    }

    @Override
    void buildWeight() {
        animal.setWeight(12);
    }

    @Override
    void buildAge() {
        animal.setAge(5);
    }
}
