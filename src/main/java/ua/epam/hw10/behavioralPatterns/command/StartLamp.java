package ua.epam.hw10.behavioralPatterns.command;

public class StartLamp implements Command {
    Lamp lamp;
    public StartLamp(Lamp lamp) {
        this.lamp = lamp;
    }
    public void execute() {
        lamp.turnOnLightBulb();
    }
}
