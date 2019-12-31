package ua.epam.hw10.behavioralPatterns.chain;

interface Payment {
    void setNext(Payment payment);
    void pay();
}
