package ua.epam.hw10.creationalPatterns.abstractFactory.moonRover;

import ua.epam.hw10.creationalPatterns.abstractFactory.Engineer;
import ua.epam.hw10.creationalPatterns.abstractFactory.ProblemDetector;
import ua.epam.hw10.creationalPatterns.abstractFactory.ProjectCrewFactory;
import ua.epam.hw10.creationalPatterns.abstractFactory.Tester;

public class MoonRoverCrewFactory implements ProjectCrewFactory {
    @Override
    public Engineer getEngineer() {
        return new MoonRoverEngineer();
    }

    @Override
    public Tester getTester() {
        return new MoonRoverTester();
    }

    @Override
    public ProblemDetector getProblemDetector() {
        return new MoonRoverProblemDetector();
    }
}
