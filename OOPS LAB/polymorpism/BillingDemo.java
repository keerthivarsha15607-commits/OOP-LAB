class InvoiceProcessor {
    public void generateInvoice(String customer, double amount) {
        double finalAmount = calculateTotal(amount);
        System.out.println("Customer: " + customer);
        System.out.println("Amount: " + finalAmount);
    }
        private double calculateTotal(double amount) {
        System.out.println("Calculating total in superclass...");
        return amount + (amount * 0.1); // 10% tax
    }
}

class RetailInvoice extends InvoiceProcessor {

    @Override
    public void generateInvoice(String customer, double amount) {
        double discountedAmount = applyDiscount(amount);
        System.out.println("Retail Invoice for: " + customer);
        System.out.println("Discounted Amount: " + discountedAmount);
    }
        public double applyDiscount(double amount) {
        return amount - (amount * 0.2); // 20% discount
    }
    }

public class BillingDemo {
    public static void main(String[] args) {
        InvoiceProcessor obj = new RetailInvoice();
        obj.generateInvoice("Keerthi", 1000);
    }
}