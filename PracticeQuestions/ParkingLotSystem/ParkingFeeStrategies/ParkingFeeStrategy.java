package PracticeQuestions.ParkingLotSystem.parkingFeeStrategies;

import PracticeQuestions.ParkingLotSystem.ParkingTicket;

public interface ParkingFeeStrategy {
    double calculateFee(ParkingTicket ticket);
}
