// File: PaymentAdapterExample.java

// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee 1
class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}

// Adaptee 2
class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Stripe.");
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway paypal;

    public PayPalAdapter(PayPalGateway paypal) {
        this.paypal = paypal;
    }

    public void processPayment(double amount) {
        paypal.sendPayment(amount);
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripe;

    public StripeAdapter(StripeGateway stripe) {
        this.stripe = stripe;
    }

    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}
