package ua.epam.hw10.behavioralPatterns.visitor;

public class Wiring implements Lamp {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
