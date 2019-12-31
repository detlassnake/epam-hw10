package ua.epam.hw10.structuralPatterns.adapter;

public class Adapter extends App implements DataBase{

    @Override
    public void create() {
        createObject();
    }

    @Override
    public void read() {
        readObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void delete() {
        DeleteObject();
    }
}
