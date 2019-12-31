package ua.epam.hw10.structuralPatterns.bridge;

public class UnknownCar extends Car {
    public UnknownCar(Engine engine) {
        super(engine);
    }
    public void setEngine() {
        System.out.print("UnknownCar engine: ");
        engine.setEngine();
    }
}
