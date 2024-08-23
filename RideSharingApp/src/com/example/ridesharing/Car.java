package com.example.ridesharing;

public class Car implements Vehicle {
    @Override
    public void requestRide() {
        System.out.println("Car ride has been requested.");
    }
}
