package ua.epam.hw10.structuralPatterns.bridge;

public class SportCar extends Car {
    public SportCar(Engine engine) {
        super(engine);
    }

    public void setEngine() {
        System.out.print("SportCar engine: ");
        engine.setEngine();
    }
}
