package com.example.ridesharing;

public interface PaymentFactory {
    PaymentMethod createPaymentMethod(String type);
}
