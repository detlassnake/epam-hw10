package ua.epam.hw10.behavioralPatterns.memento;

public class Client {
    public static void main(String[] args) {
        SaveUser saveUser = new SaveUser();
        User user = new User("Peter", 17);
        saveUser.add(user.save());
        user.restore(saveUser.get(0));
    }
}
