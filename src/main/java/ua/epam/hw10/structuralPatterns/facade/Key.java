package ua.epam.hw10.structuralPatterns.facade;

public class Key implements Car {
    public void start() {
        System.out.println("Input key");
    }
    public void stop() {
        System.out.println("Output key");
    }
}
