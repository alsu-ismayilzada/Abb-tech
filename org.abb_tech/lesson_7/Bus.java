package lesson_7;

import java.util.*;

public class Bus {

    private final String name;
    private final int capacity = 5;

    List<Passenger> passengers = new ArrayList<>();

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public String getName() {
        return name;
    }

    public Bus(String name) {
        this.name = name;
    }

    public void arriveBusStop(BusStop busStop, Random random) {

        var passengersCount = random.nextInt(4);
        while (passengersCount > 0 && !passengers.isEmpty()) {
            int randomIndex = random.nextInt(passengers.size());
            Passenger leavingPassenger = passengers.remove(randomIndex);
            System.out.println(leavingPassenger.getName() + " left the bus");
            passengersCount--;
        }

        if(passengers.size() < capacity && !busStop.getPassengers().isEmpty()){
            Passenger p = busStop.getPassengers().poll();
            System.out.println(p.getName() + " boarded the bus.");
            passengers.add(p);
        }


    }
}
