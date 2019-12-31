package ua.epam.hw10.behavioralPatterns.visitor;

public class Client {
    public static void main(String[] args) {
        Lamp computer = new XiaomiLamp();
        computer.accept(new LampVisitor());
    }
}
