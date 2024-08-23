package com.example.ridesharing;

public class Bike implements Vehicle {
    @Override
    public void requestRide() {
        System.out.println("Bike ride has been requested.");
    }
}
