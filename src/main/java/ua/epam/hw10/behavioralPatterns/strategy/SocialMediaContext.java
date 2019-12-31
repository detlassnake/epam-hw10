package ua.epam.hw10.behavioralPatterns.strategy;

public class SocialMediaContext {
    SocialMediaStrategy smStrategy;
    public void setSocialMediaStrategy(SocialMediaStrategy smStrategy) {
        this.smStrategy = smStrategy;
    }

    public void connect(String name) {
        smStrategy.connectTo(name);
    }
}
