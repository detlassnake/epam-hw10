package ua.epam.hw10.behavioralPatterns.visitor;

public interface Visitor {
    void visit(XiaomiLamp sportsCar);
    void visit(LightBulb lightBulb);
    void visit(Wiring wiring);
}

