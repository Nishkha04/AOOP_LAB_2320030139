package com.co1;

public class Light implements Device {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    @Override
    public void turnOn() {
        System.out.println(location + " light is ON");
    }

    @Override
    public void turnOff() {
        System.out.println(location + " light is OFF");
    }
}
