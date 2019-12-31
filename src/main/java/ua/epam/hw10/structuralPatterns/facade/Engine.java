package ua.epam.hw10.structuralPatterns.facade;

public class Engine implements Car {
    public void start() {
        System.out.println("Start engine");
    }
    public void stop() {
        System.out.println("Stop engine");
    }
}
