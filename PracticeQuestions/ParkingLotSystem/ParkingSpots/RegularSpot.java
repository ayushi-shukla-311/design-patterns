package PracticeQuestions.ParkingLotSystem.parkingSpots;

import PracticeQuestions.ParkingLotSystem.ParkingSpotType;

public class RegularSpot extends ParkingSpot {
    public RegularSpot(String id) {
        super(id, ParkingSpotType.REGULAR);
    }
}
