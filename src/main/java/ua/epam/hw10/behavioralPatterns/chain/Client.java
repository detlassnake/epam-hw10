package ua.epam.hw10.behavioralPatterns.chain;

public class Client {
    public static void main(String[] args) {
        Payment visaPayment = new VisaPayment();
        Payment masterCardPayment = new MasterCard();
        visaPayment.pay();
        visaPayment.setNext(masterCardPayment);
        visaPayment.pay();
    }
}
