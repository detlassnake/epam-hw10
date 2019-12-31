package ua.epam.hw10.creationalPatterns.abstractFactory;

import ua.epam.hw10.creationalPatterns.abstractFactory.moonRover.MoonRoverCrewFactory;

public class SpaceX {
    public static void main(String[] args) {
        ProjectCrewFactory projectCrewFactory = new MoonRoverCrewFactory();
        Engineer engineer = projectCrewFactory.getEngineer();
        Tester tester = projectCrewFactory.getTester();
        ProblemDetector problemDetector = projectCrewFactory.getProblemDetector();

        System.out.println("Create moon rover");
        engineer.build();
        tester.test();
        problemDetector.problemCheck();
    }
}
