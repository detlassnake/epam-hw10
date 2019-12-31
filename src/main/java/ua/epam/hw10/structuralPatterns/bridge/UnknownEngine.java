package ua.epam.hw10.structuralPatterns.bridge;

public class UnknownEngine implements Engine {
    public void setEngine(){
        System.out.println("unknown");
    }
}
