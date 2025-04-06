package PracticeQuestions.ParkingLotSystem;

class ExitPanel {
    private String id;
    private int distanceFromGate;

    public ExitPanel(String id, int distanceFromGate) {
        this.id = id;
        this.distanceFromGate = distanceFromGate;
    }

    public String getId() { return id; }
    public int getDistance() { return distanceFromGate; }

    public double processPayment(String ticketNumber) {
        ParkingLot lot = ParkingLot.getInstance();
        return lot.unparkVehicle(ticketNumber);
    }
}
