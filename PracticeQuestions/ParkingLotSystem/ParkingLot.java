package PracticeQuestions.ParkingLotSystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import PracticeQuestions.ParkingLotSystem.ParkingFeeStrategies.HourlyFeeStrategy;
import PracticeQuestions.ParkingLotSystem.ParkingFeeStrategies.ParkingFeeStrategy;
import PracticeQuestions.ParkingLotSystem.ParkingSpots.ParkingSpot;
import PracticeQuestions.ParkingLotSystem.Vehicles.Vehicle;

public class ParkingLot {
    private static ParkingLot instance = null;
    private List<ParkingLevel> levels = new ArrayList<>();
    private List<EntrancePanel> entrances = new ArrayList<>();
    private List<ExitPanel> exits = new ArrayList<>();
    private ParkingFeeStrategy feeStrategy = new HourlyFeeStrategy();
    private Map<String, ParkingTicket> activeTickets = new HashMap<>();

    private ParkingLot() {}

    public static ParkingLot getInstance() {
        if (instance == null) {
            instance = new ParkingLot();
        }
        return instance;
    }

    public void addLevel(ParkingLevel level) {
        levels.add(level);
    }

    public void addEntrance(EntrancePanel panel) {
        entrances.add(panel);
    }

    public void addExit(ExitPanel panel) {
        exits.add(panel);
    }

    public EntrancePanel getNearestEntrance() {
        return entrances.stream().min(Comparator.comparingInt(EntrancePanel::getDistance)).orElse(null);
    }

    public ExitPanel getNearestExit() {
        return exits.stream().min(Comparator.comparingInt(ExitPanel::getDistance)).orElse(null);
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            ParkingSpot spot = level.findAvailableSpot(vehicle.getType());
            if (spot != null) {
                spot.assignVehicle(vehicle);
                level.updateDisplayBoard();
                ParkingTicket ticket = new ParkingTicket(vehicle, spot);
                activeTickets.put(ticket.getTicketNumber(), ticket);
                return ticket;
            }
        }
        return null; // No available spot
    }

    public double unparkVehicle(String ticketNumber) {
        ParkingTicket ticket = activeTickets.get(ticketNumber);
        if (ticket == null) return -1;

        ticket.closeTicket();
        ticket.getSpot().removeVehicle();
        for (ParkingLevel level : levels) {
            level.updateDisplayBoard();
        }
        activeTickets.remove(ticketNumber);

        return feeStrategy.calculateFee(ticket);
    }
    
}
