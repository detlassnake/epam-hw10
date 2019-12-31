package ua.epam.hw10.behavioralPatterns.visitor;

public interface Lamp {
    void accept(Visitor visitor);
}
