package ua.epam.hw10.behavioralPatterns.visitor;

public class LightBulb implements Lamp {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
