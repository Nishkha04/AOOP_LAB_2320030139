package com.example.ridesharing;

public abstract class VehicleFactory {
    public abstract Vehicle createVehicle();

    public static VehicleFactory getFactory(String vehicleType) {
        switch (vehicleType) {
            case "Car":
                return new CarFactory();
            case "Bike":
                return new BikeFactory();
            case "Scooter":
                return new ScooterFactory();
            default:
                throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}

class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

class ScooterFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Scooter();
    }
}
