package ua.epam.hw10.behavioralPatterns.visitor;

public class LampVisitor implements Visitor {
    public void visit(XiaomiLamp computer) {
        print("lamp");
    }
    public void visit(LightBulb lightBulb) {
        print("lightBulb");
    }
    public void visit(Wiring wiring) {
        print("wiring");
    }
    private void print(String string) {
        System.out.println(string);
    }
}
