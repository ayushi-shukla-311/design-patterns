package PracticeQuestions.ParkingLotSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import PracticeQuestions.ParkingLotSystem.parkingSpots.ParkingSpot;

public class ParkingLevel {
    private String name;
    private List<ParkingSpot> spots = new ArrayList<>();
    private DisplayBoard displayBoard = new DisplayBoard();
    
    public ParkingLevel(String name) {
        this.name = name;
    }

    public void addSpot(ParkingSpot spot) {
        spots.add(spot);
        updateDisplayBoard();
    }

    public ParkingSpot findAvailableSpot(VehicleType type){
        for (ParkingSpot spot : spots) {
            if (spot.isFree() && isSpotCompatible(spot.getType(), type)) {
                return spot;
            }
        }
        return null;
    }

    private boolean isSpotCompatible(ParkingSpotType spotType, VehicleType vehicleType) {
        if (vehicleType == VehicleType.CAR) {
            return spotType == ParkingSpotType.COMPACT || spotType == ParkingSpotType.REGULAR;
        } else if (vehicleType == VehicleType.MOTORCYCLE) {
            return spotType == ParkingSpotType.COMPACT;
        } else if (vehicleType == VehicleType.TRUCK) {
            return spotType == ParkingSpotType.REGULAR || spotType == ParkingSpotType.HANDICAPPED;
        }
        return false;
    }

    public void updateDisplayBoard() {
        Map<ParkingSpotType, Integer> countMap = new HashMap<>();
        for (ParkingSpot spot : spots) {
            if (spot.isFree()) {
                countMap.put(spot.getType(), countMap.getOrDefault(spot.getType(), 0) + 1);
            }
        }
        for (Map.Entry<ParkingSpotType, Integer> entry : countMap.entrySet()) {
            displayBoard.updateAvailability(entry.getKey(), entry.getValue());
        }
        displayBoard.showAvailability();
    }
}
