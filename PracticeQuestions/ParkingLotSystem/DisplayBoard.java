package PracticeQuestions.ParkingLotSystem;

import java.util.HashMap;
import java.util.Map;

class DisplayBoard {
    private Map<ParkingSpotType, Integer> availableSpots = new HashMap<>();

    public void updateAvailability(ParkingSpotType type, int count) {
        availableSpots.put(type, count);
    }

    public void showAvailability(){
        System.out.println("Parking Spot Availability:");
        for(Map.Entry<ParkingSpotType, Integer> entry: availableSpots.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue() + "spots available");
        }
    }
}
