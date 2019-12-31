package ua.epam.hw10.behavioralPatterns.mediator;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("user1");
        User user2 = new User("user2");
        user1.sendMessage("msgText1");
        user2.sendMessage("msgText2");
    }
}
