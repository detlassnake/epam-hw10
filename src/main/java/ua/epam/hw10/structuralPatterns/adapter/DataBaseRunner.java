package ua.epam.hw10.structuralPatterns.adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new Adapter();

        dataBase.create();
        dataBase.read();
        dataBase.update();
        dataBase.delete();
    }
}
