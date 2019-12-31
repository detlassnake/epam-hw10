package ua.epam.hw10.structuralPatterns.facade;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.startCar();
        facade.stopCar();
    }
}
