package PracticeQuestions.ParkingLotSystem.parkingFeeStrategies;

import PracticeQuestions.ParkingLotSystem.ParkingTicket;

public class HourlyFeeStrategy implements ParkingFeeStrategy {
    private static final double HOURLY_RATE = 5.0; // Example hourly rate

    @Override
    public double calculateFee(ParkingTicket ticket) {
        // Calculate the fee based on the parked duration in hours
        long hours = java.time.Duration.between(ticket.getEntryTime(), ticket.getExitTime()).toHours();
        return Math.max(1, hours)*HOURLY_RATE; // Ensure at least 1 hour is charged
    
    }
}
