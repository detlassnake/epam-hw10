package ua.epam.hw10.structuralPatterns.flyweight;

public class Client {
    public static void main(String[] args) {
        int rows = 5;
        FlyweightFactory theFactory = new FlyweightFactory(rows);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                theFactory.getFlyweight(i).report(j);
            }
            System.out.println();
        }
    }
}
