package com.example.ridesharing;

public class Scooter implements Vehicle {
    @Override
    public void requestRide() {
        System.out.println("Scooter ride has been requested.");
    }
}
