package com.example.ridesharing;

public class PayPal implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
