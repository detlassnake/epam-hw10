package ua.epam.hw10.creationalPatterns.abstractFactory.rocket;

import ua.epam.hw10.creationalPatterns.abstractFactory.Engineer;
import ua.epam.hw10.creationalPatterns.abstractFactory.ProblemDetector;
import ua.epam.hw10.creationalPatterns.abstractFactory.ProjectCrewFactory;
import ua.epam.hw10.creationalPatterns.abstractFactory.Tester;

public class RocketCrewFactory implements ProjectCrewFactory {
    @Override
    public Engineer getEngineer() {
        return new RocketEngineer();
    }

    @Override
    public Tester getTester() {
        return new RocketTester();
    }

    @Override
    public ProblemDetector getProblemDetector() {
        return new Houston();
    }
}
