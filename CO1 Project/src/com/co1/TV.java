package com.co1;

public class TV implements Device {
    private String location;

    public TV(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println(location + " TV is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(location + " TV is OFF");
    }
}
