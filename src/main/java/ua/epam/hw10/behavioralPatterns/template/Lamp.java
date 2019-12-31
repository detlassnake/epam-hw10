package ua.epam.hw10.behavioralPatterns.template;

public abstract class Lamp {
    abstract void startLightBulb();
    abstract void stopLightBulb();

    public final void start(){
        startLightBulb();
        stopLightBulb();
    }
}

