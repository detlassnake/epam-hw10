package ua.epam.hw10.behavioralPatterns.observer;

public class Client {
    public static void main(String[] args) {
        University university = new University();
        Director director = new Director();
        university.addStudent("Vova");
        university.addObserver(director);
        university.addStudent("Serg");
        university.removeStudent("Serg");
    }
}
