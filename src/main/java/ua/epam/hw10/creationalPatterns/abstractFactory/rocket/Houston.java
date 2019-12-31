package ua.epam.hw10.creationalPatterns.abstractFactory.rocket;

import ua.epam.hw10.creationalPatterns.abstractFactory.ProblemDetector;

public class Houston implements ProblemDetector {
    @Override
    public void problemCheck() {
        System.out.println("Houston we don't have any problems");
    }
}
