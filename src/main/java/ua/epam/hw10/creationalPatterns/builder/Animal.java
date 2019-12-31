package ua.epam.hw10.creationalPatterns.builder;

public class Animal {
    private String name;
    private int weight;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }
}
