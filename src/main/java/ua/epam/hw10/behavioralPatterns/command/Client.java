package ua.epam.hw10.behavioralPatterns.command;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        StartLamp startLamp = new StartLamp(lamp);
        StopLamp stopLamp = new StopLamp(lamp);
        LampInvoker lampInvoker = new LampInvoker(startLamp);
        lampInvoker.execute();
    }
}
