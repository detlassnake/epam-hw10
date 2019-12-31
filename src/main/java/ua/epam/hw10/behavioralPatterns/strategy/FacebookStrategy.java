package ua.epam.hw10.behavioralPatterns.strategy;

public class FacebookStrategy implements SocialMediaStrategy {
    public void connectTo(String friendName) {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}
