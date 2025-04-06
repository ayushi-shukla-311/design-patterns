package PracticeQuestions.ParkingLotSystem.ParkingSpots;

import PracticeQuestions.ParkingLotSystem.ParkingSpotType;
import PracticeQuestions.ParkingLotSystem.Vehicles.Vehicle;

public abstract class ParkingSpot {
    private String id;
    private boolean isFree;
    private Vehicle vehicle;
    private ParkingSpotType parkingSpotType;

    public ParkingSpot(String id, ParkingSpotType parkingSpotType) {
        this.id = id;
        this.isFree = true;
        this.parkingSpotType = parkingSpotType;
    }

    public boolean isFree() {
        return isFree;
    }

    public void assignVehicle(Vehicle vehicle) {
        if (isFree) {
            this.vehicle = vehicle;
            this.isFree = false;
        } else {
            throw new IllegalStateException("Parking spot is already occupied.");
        }
    }

    public void removeVehicle() {
        if (!isFree) {
            this.vehicle = null;
            this.isFree = true;
        } else {
            throw new IllegalStateException("Parking spot is already empty.");
        }
    }
    
    public ParkingSpotType getType() {
        return parkingSpotType;
    }
    
    public String getId() {
        return id;
    }
    
    public Vehicle getVehicle() {
        return vehicle;
    }
    
}
