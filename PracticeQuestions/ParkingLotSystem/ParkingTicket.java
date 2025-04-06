package PracticeQuestions.ParkingLotSystem;

import java.time.LocalDateTime;

import PracticeQuestions.ParkingLotSystem.ParkingSpots.ParkingSpot;
import PracticeQuestions.ParkingLotSystem.Vehicles.Vehicle;

public class ParkingTicket {
    private static int counter = 1;
    private String ticketNumber;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private TicketStatus status;

    public ParkingTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.ticketNumber = "TICKET-" + counter++;
        this.entryTime = LocalDateTime.now();
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.status = TicketStatus.ACTIVE;
    }

    public void closeTicket() {
        this.exitTime = LocalDateTime.now();
        this.status = TicketStatus.PAID;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getSpot() {
        return parkingSpot;
    }

    public TicketStatus getStatus() {
        return status;
    }

    public void setStatus(TicketStatus status) {
        this.status = status;
    }

}
