package ua.epam.hw10.behavioralPatterns.chain;

public class VisaPayment implements Payment {
    private Payment payment;

    public void setNext(Payment payment) {
        this.payment = payment;
    }
    public void pay() {
        if (payment == null) {
            System.out.println("VisaPayment payment");
        } else {
            System.out.println(payment);
        }
    }

    @Override
    public String toString() {
        return "VisaPayment " +
                "payment";
    }
}
