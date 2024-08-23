package com.example.ridesharing;

public class GooglePay implements PaymentMethod {
    @Override
    public void makePayment(double amount) {
        System.out.println("Paid $" + amount + " using Google Pay.");
    }
}
