package ua.epam.hw10.structuralPatterns.composite;

public class House {
    public static void main(String[] args) {
        Pets pets = new Pets();

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        pets.addAnimal(animal1);
        pets.addAnimal(animal2);

        pets.createHouse();
    }
}
