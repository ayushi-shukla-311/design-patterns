package PracticeQuestions.ParkingLotSystem.vehicles;

import PracticeQuestions.ParkingLotSystem.VehicleType;; // Add this import statement

public class Car extends Vehicle {
    public Car(String plate){
        super(plate, VehicleType.CAR);
    }
}
