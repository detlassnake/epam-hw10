package ua.epam.hw10.behavioralPatterns.template;

public class Client {
    public static void main(String[] args) {
        Lamp lamp1 = new LampOne();
        lamp1.start();
        System.out.println();
        Lamp lamp2 = new LampTwo();
        lamp2.start();
    }
}
