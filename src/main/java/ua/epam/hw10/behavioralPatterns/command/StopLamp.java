package ua.epam.hw10.behavioralPatterns.command;

public class StopLamp implements Command {
    Lamp lamp;
    public StopLamp(Lamp lamp) {
        this.lamp = lamp;
    }
    public void execute() {
        lamp.turnOffLightBulb();
    }
}
