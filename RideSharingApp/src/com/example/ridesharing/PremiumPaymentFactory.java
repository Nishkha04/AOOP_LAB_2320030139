package com.example.ridesharing;

public class PremiumPaymentFactory implements PaymentFactory {
    @Override
    public PaymentMethod createPaymentMethod(String type) {
        switch (type) {
            case "CreditCard":
                return new CreditCard();
            case "PayPal":
                return new PayPal();
            case "GooglePay":
                return new GooglePay();
            default:
                throw new IllegalArgumentException("Unknown payment method.");
        }
    }
}
