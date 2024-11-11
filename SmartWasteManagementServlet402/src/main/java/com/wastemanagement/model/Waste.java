package com.wastemanagement.model;

public class Waste {
    private String type;
    private double weight;

    public Waste(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }
}
