package ua.epam.hw10.behavioralPatterns.strategy;

public class Client {
    public static void main(String[] args) {
        SocialMediaContext context = new SocialMediaContext();
        context.setSocialMediaStrategy(new FacebookStrategy());
        context.connect("Vova");
        context.setSocialMediaStrategy(new TwitterStrategy());
        context.connect("Vova");

    }
}
