package ua.epam.hw10.behavioralPatterns.mediator;

public class Mediator {
    public static void sendMessage(User user, String msg){
        System.out.println(user.getName() + ": " + msg);
    }
}

