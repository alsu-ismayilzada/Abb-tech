package lesson_7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class BusStop {

    private final String name;
    private final int stopCapacity = 10;

    private PriorityQueue<Passenger> passengers = new PriorityQueue<>(Comparator.comparing(Passenger::isPriority).reversed());

    public String getName() {
        return name;
    }
    public BusStop(String name) {
        this.name = name;
    }
    public PriorityQueue<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        if(passengers.size() < stopCapacity ){
            passengers.add(passenger);
        }
    }
}
