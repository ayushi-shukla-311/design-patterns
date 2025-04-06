package PracticeQuestions.ParkingLotSystem.parkingSpots;

import PracticeQuestions.ParkingLotSystem.ParkingSpotType;

public class HandicappedSpot extends ParkingSpot{
    public HandicappedSpot(String id) {
        super(id, ParkingSpotType.HANDICAPPED);
    }
}
