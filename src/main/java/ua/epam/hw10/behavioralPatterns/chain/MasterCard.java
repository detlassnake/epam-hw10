package ua.epam.hw10.behavioralPatterns.chain;

public class MasterCard implements Payment {
    private Payment payment;

    public void setNext(Payment payment) {
        this.payment = payment;
    }
    public void pay() {
        if (payment == null) {
            System.out.println("MasterCard payment");
        }else {
            System.out.println(payment);
        }
    }

    @Override
    public String toString() {
        return "MasterCard" +
                " payment";
    }
}
