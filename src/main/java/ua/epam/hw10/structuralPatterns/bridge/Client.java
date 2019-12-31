package ua.epam.hw10.structuralPatterns.bridge;

public class Client {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car unknownCar = new UnknownCar(new UnknownEngine());
        unknownCar.setEngine();
    }
}
