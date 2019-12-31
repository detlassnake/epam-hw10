package ua.epam.hw10.creationalPatterns.abstractFactory.moonRover;

import ua.epam.hw10.creationalPatterns.abstractFactory.ProblemDetector;

public class MoonRoverProblemDetector implements ProblemDetector {

    @Override
    public void problemCheck() {
        System.out.println("No problem");
    }
}
