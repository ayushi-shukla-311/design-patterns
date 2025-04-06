package PracticeQuestions.ParkingLotSystem.ParkingFeeStrategies;

import PracticeQuestions.ParkingLotSystem.ParkingTicket;

public interface ParkingFeeStrategy {
    double calculateFee(ParkingTicket ticket);
}
