package PracticeQuestions.ParkingLotSystem.vehicles;

import PracticeQuestions.ParkingLotSystem.VehicleType;

public abstract class Vehicle {
    private String licensePlate;
    private VehicleType vehicleType;
    
    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getType() {
        return vehicleType;
    }
}
