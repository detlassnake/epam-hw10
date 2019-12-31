package ua.epam.hw10.creationalPatterns.builder;

public class CatBuilder extends AnimalBuilder {
    @Override
    void buildName() {
        animal.setName("CatName");
    }

    @Override
    void buildWeight() {
        animal.setWeight(18);
    }

    @Override
    void buildAge() {
        animal.setAge(8);
    }
}
