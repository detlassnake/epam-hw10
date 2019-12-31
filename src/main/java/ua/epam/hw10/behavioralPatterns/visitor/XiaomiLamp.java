package ua.epam.hw10.behavioralPatterns.visitor;

public class XiaomiLamp implements Lamp {
    Lamp[] lamps;
    public XiaomiLamp(){
        lamps = new Lamp[]{new LightBulb(), new Wiring()};
    }
    public void accept(Visitor visitor) {
        for (int i = 0; i < lamps.length; i++) {
            lamps[i].accept(visitor);
        }
        visitor.visit(this);
    }
}
