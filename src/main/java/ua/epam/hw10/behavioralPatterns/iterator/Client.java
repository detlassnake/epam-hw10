package ua.epam.hw10.behavioralPatterns.iterator;

public class Client {
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();
        for (Iterator iterator = namesRepository.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
