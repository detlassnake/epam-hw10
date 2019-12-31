package ua.epam.hw10.structuralPatterns.flyweight;

class Flyweight {
    private int row;
    public Flyweight(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }
    void report(int col) {
        System.out.print(" " + row + col);
    }
}
