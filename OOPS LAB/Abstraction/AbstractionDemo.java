abstract class Payment {
        abstract void pay(double amount);
        public void paymentInfo() {
        System.out.println("Processing payment securely...");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card");
    }
}
class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Payment p; // abstract reference
        p = new CreditCardPayment();
        p.paymentInfo();
        p.pay(2000);
        p = new UPIPayment();
        p.paymentInfo();
        p.pay(1500);
    }
}