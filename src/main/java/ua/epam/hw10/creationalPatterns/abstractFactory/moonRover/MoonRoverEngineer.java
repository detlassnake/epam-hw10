package ua.epam.hw10.creationalPatterns.abstractFactory.moonRover;

import ua.epam.hw10.creationalPatterns.abstractFactory.Engineer;

public class MoonRoverEngineer implements Engineer {
    @Override
    public void build() {
        System.out.println("Build moon rover");
    }
}
