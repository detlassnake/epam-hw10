package ua.epam.hw10.structuralPatterns.flyweight;

public class FlyweightFactory {
    private Flyweight[] pool;
    public FlyweightFactory(int maxRows) {
        pool = new Flyweight[maxRows];
    }
    public Flyweight getFlyweight(int row) {
        if (pool[row] == null) {
            pool[row] = new Flyweight(row);
        }
        return pool[row];
    }
}
