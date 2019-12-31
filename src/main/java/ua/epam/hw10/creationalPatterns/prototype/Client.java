package ua.epam.hw10.creationalPatterns.prototype;

public class Client {
    public static void main(String[] args) {
        SomeObject prototype = new SomeObject();
        SomeObject clone = prototype.copy();
        System.out.println(clone.toString());
        System.out.println(prototype.toString());
    }
}
