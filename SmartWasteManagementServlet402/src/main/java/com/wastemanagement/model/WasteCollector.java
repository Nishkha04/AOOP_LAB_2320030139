package com.wastemanagement.model;

public class WasteCollector {
    private double organicWaste;
    private double recyclableWaste;
    private double hazardousWaste;
    
    // Constructor
    public WasteCollector() {
        this.organicWaste = 0.0;
        this.recyclableWaste = 0.0;
        this.hazardousWaste = 0.0;
    }

    public void addWaste(String wasteType, double weight) {
        switch (wasteType) {
            case "Organic":
                addOrganicWaste(weight);
                break;
            case "Recyclable":
                addRecyclableWaste(weight);
                break;
            case "Hazardous":
                addHazardousWaste(weight);
                break;
            default:
                throw new IllegalArgumentException("Unknown waste type: " + wasteType);
        }
    }

    private void addOrganicWaste(double weight) {
        organicWaste += weight;
    }

    private void addRecyclableWaste(double weight) {
        recyclableWaste += weight;
    }

    private void addHazardousWaste(double weight) {
        hazardousWaste += weight;
    }

    public String emptyOrganicWaste() {
        double amount = organicWaste;
        organicWaste = 0;
        return "The organic waste bin has been emptied. Amount: " + amount + " kg.";
    }

    public String emptyRecyclableWaste() {
        double amount = recyclableWaste;
        recyclableWaste = 0;
        return "The recyclable waste bin has been emptied. Amount: " + amount + " kg.";
    }

    public String emptyHazardousWaste() {
        double amount = hazardousWaste;
        hazardousWaste = 0;
        return "The hazardous waste bin has been emptied. Amount: " + amount + " kg.";
    }

    public String emptyAllBins() {
        String organicMessage = emptyOrganicWaste();
        String recyclableMessage = emptyRecyclableWaste();
        String hazardousMessage = emptyHazardousWaste();
        return organicMessage + "\n" + recyclableMessage + "\n" + hazardousMessage;
    }

    public double getTotalCollectedWeight() {
        return organicWaste + recyclableWaste + hazardousWaste;
    }

    public double getOrganicWaste() {
        return organicWaste;
    }

    public double getRecyclableWaste() {
        return recyclableWaste;
    }

    public double getHazardousWaste() {
        return hazardousWaste;
    }
}
