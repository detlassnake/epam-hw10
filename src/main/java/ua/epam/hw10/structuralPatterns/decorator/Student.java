package ua.epam.hw10.structuralPatterns.decorator;

public class Student extends PersonDecorator{
    public Student(Person person) {
        super(person);
    }

    public String doSomethingInUniversity() {
        return "do something in university";
    }

    @Override
    public String doSomething() {
        return super.doSomething() + doSomethingInUniversity();
    }
}
