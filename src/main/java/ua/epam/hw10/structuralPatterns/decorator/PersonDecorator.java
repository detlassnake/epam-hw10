package ua.epam.hw10.structuralPatterns.decorator;

public class PersonDecorator implements Person{
    Person person;

    public PersonDecorator(Person person) {
        this.person = person;
    }

    @Override
    public String doSomething() {
        return person.doSomething();
    }
}
