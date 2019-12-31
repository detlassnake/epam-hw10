package ua.epam.hw10.creationalPatterns.factory;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new DogFactory();
        Animal animal = animalFactory.createAnimal();

        animal.doSomething();
    }
}
