package PracticeQuestions.ParkingLotSystem;

import PracticeQuestions.ParkingLotSystem.vehicles.Vehicle;

public class EntrancePanel {
    private String id;
    private int distanceFromGate;

    public EntrancePanel(String id, int distanceFromGate) {
        this.id = id;
        this.distanceFromGate = distanceFromGate;
    }

    public String getId() { return id; }
    public int getDistance() { return distanceFromGate; }

    public ParkingTicket generateTicket(Vehicle vehicle) {
        ParkingLot lot = ParkingLot.getInstance();
        return lot.parkVehicle(vehicle);
    }
}
