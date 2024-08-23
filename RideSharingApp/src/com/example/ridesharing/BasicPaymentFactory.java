package com.example.ridesharing;

public class BasicPaymentFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod(String type) {
        switch (type) {
            case "CreditCard":
                return new CreditCard();
            case "PayPal":
                return new PayPal();
            default:
                throw new IllegalArgumentException("Unknown payment method.");
        }
    }
}
