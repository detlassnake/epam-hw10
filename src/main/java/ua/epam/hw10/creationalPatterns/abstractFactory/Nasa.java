package ua.epam.hw10.creationalPatterns.abstractFactory;

import ua.epam.hw10.creationalPatterns.abstractFactory.rocket.RocketCrewFactory;

public class Nasa {
    public static void main(String[] args) {
        ProjectCrewFactory projectCrewFactory = new RocketCrewFactory();
        Engineer engineer = projectCrewFactory.getEngineer();
        Tester tester = projectCrewFactory.getTester();
        ProblemDetector problemDetector = projectCrewFactory.getProblemDetector();

        System.out.println("Create rocket");
        engineer.build();
        tester.test();
        problemDetector.problemCheck();
    }
}
