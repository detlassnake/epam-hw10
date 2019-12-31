package ua.epam.hw10.creationalPatterns.builder;

public class BuildAnimalRunner {
    public static void main(String[] args) {
        Scientist scientist = new Scientist();

        scientist.setBuilder(new CatBuilder());
        Animal animal = scientist.buildAnimal();
        System.out.println(animal);
    }
}
