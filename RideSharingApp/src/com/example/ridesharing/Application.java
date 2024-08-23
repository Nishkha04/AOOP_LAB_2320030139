package com.example.ridesharing;

public class Application {
    public static void main(String[] args) {
        // Singleton: User Authentication
        UserManager userManager = UserManager.getInstance();
        userManager.login("user", "password");

        if (userManager.isAuthenticated()) {
            // Factory Method: Request a Vehicle
            VehicleFactory vehicleFactory = VehicleFactory.getFactory("Car");
            Vehicle vehicle = vehicleFactory.createVehicle();
            vehicle.requestRide();

            // Abstract Factory: Make a Payment
            PaymentFactory paymentFactory = new PremiumPaymentFactory();
            PaymentMethod paymentMethod = paymentFactory.createPaymentMethod("GooglePay");
            paymentMethod.makePayment(50.0);
        }

        userManager.logout();
    }
}
