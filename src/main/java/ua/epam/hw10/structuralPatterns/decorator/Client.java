package ua.epam.hw10.structuralPatterns.decorator;

public class Client {
    public static void main(String[] args) {
        Person person = new Student(new Pupil());
        System.out.println(person.doSomething());
    }
}
