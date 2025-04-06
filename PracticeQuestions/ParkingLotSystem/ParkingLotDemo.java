package PracticeQuestions.ParkingLotSystem;


import PracticeQuestions.ParkingLotSystem.ParkingSpots.CompactSpot;
import PracticeQuestions.ParkingLotSystem.ParkingSpots.HandicappedSpot;
import PracticeQuestions.ParkingLotSystem.ParkingSpots.RegularSpot;
import PracticeQuestions.ParkingLotSystem.Vehicles.Car;
import PracticeQuestions.ParkingLotSystem.Vehicles.Vehicle;

public class ParkingLotDemo {
    public static void main(String[] args) throws InterruptedException {
        ParkingLot lot = ParkingLot.getInstance();

        ParkingLevel level1 = new ParkingLevel("L1");
        level1.addSpot(new CompactSpot("C1"));
        level1.addSpot(new RegularSpot("L1"));
        level1.addSpot(new HandicappedSpot("B1"));

        lot.addLevel(level1);

        EntrancePanel entrance1 = new EntrancePanel("E1", 10);
        EntrancePanel entrance2 = new EntrancePanel("E2", 5);
        lot.addEntrance(entrance1);
        lot.addEntrance(entrance2);

        ExitPanel exit1 = new ExitPanel("X1", 15);
        ExitPanel exit2 = new ExitPanel("X2", 7);
        lot.addExit(exit1);
        lot.addExit(exit2);

        EntrancePanel nearestEntrance = lot.getNearestEntrance();
        System.out.println("Nearest Entrance: " + nearestEntrance.getId());

        Vehicle car = new Car("KA-01-HH-1234");
        ParkingTicket ticket = nearestEntrance.generateTicket(car);

        if (ticket != null) {
            System.out.println("Parked with ticket: " + ticket.getTicketNumber());
            Thread.sleep(2000); // simulate parking duration

            ExitPanel nearestExit = lot.getNearestExit();
            System.out.println("Nearest Exit: " + nearestExit.getId());

            double fee = nearestExit.processPayment(ticket.getTicketNumber());
            System.out.println("Unparked. Fee: $" + fee);
        } else {
            System.out.println("No parking spot available.");
        }
    }
}
