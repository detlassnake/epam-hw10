package ua.epam.hw10.structuralPatterns.bridge;

public abstract class Car {
    protected Engine engine;
    public Car(Engine engine){
        this.engine = engine;
    }
    abstract public void setEngine();
}
