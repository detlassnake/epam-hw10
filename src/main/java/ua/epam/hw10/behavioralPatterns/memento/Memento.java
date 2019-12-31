package ua.epam.hw10.behavioralPatterns.memento;

public class Memento {
    private String name;
    private int age;
    public Memento(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
