package ua.epam.hw10.creationalPatterns.factory;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal(){
        return new Dog();
    }
}
