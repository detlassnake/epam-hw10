package ua.epam.hw10.creationalPatterns.abstractFactory.rocket;

import ua.epam.hw10.creationalPatterns.abstractFactory.Engineer;

public class RocketEngineer implements Engineer {
    @Override
    public void build() {
        System.out.println("Build rocket");
    }
}
