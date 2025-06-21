// File: Main.java

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(2500);

        // Using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.makePayment(1800);

        // No strategy set
        context.setPaymentStrategy(null);
        context.makePayment(500);
    }
}
