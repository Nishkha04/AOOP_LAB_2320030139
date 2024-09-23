package com.co1;

public class Fan implements Device {
    private String location;

    public Fan(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println(location + " fan is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(location + " fan is OFF");
    }
}
