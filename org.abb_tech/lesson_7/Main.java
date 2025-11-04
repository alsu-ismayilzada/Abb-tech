package lesson_7;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();

        BusStop busStop1 = new BusStop("BusStop1");
        BusStop busStop2 = new BusStop("BusStop2");
        BusStop busStop3 = new BusStop("BusStop3");

        Bus bus = new Bus("6A");
        bus.passengers.add(new Passenger("Murat", true));
        bus.passengers.add(new Passenger("Ali", false));
        bus.passengers.add(new Passenger("Mikolaj", true));

        busStop1.addPassenger(new Passenger("Alsu", true));
        busStop1.addPassenger(new Passenger("Ayan", false));
        busStop1.addPassenger(new Passenger("Anar", false));
        busStop1.addPassenger(new Passenger("Marat", true));

        busStop2.addPassenger(new Passenger("Aynur", false));
        busStop2.addPassenger(new Passenger("Hüseyn", true));
        busStop2.addPassenger(new Passenger("Elxan", false));
        busStop2.addPassenger(new Passenger("Sebine", false));
        busStop2.addPassenger(new Passenger("Orxan", false));

        busStop3.addPassenger(new Passenger("İlkin", false));
        busStop3.addPassenger(new Passenger("Sebnem", true));
        busStop3.addPassenger(new Passenger("Aysu", false));


        List<BusStop> busStops = List.of(busStop1, busStop2, busStop3);

        for(BusStop busStop : busStops){
            System.out.println("In " + busStop.getName() + ": ");
            bus.arriveBusStop(busStop, random);
            System.out.println("Bus now: " + bus.getPassengers() + "\n");
        }

        System.out.println("Passengers in Bus: " + bus.getPassengers());
        for(BusStop busStop : busStops){
            System.out.println("Passengers at " + busStop.getName() + ": " + busStop.getPassengers());
        }

    }
}
