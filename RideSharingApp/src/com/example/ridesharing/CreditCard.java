package com.example.ridesharing;

public class CreditCard implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}
