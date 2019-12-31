package ua.epam.hw10.creationalPatterns.abstractFactory;

public interface ProjectCrewFactory {
    Engineer getEngineer();
    Tester getTester();
    ProblemDetector getProblemDetector();
}
