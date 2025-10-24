package lesson_5;

import lesson_5.enums.TransportType;
import lesson_5.model.*;

public class TransportManagement {

    public static Transport getTransport(TransportType type) {

        switch (type) {
            case BUS:
                return new Bus(0.02, 60.0);
            case TAXI:
                return new Taxi(0.2, 90.0);
            case SCOOTER:
                return new Scooter(0.1, 25.0);
            case BICYCLE:
                return new Bicycle(0.3, 40.0);
            default:
                System.out.println("Invalid transport");
        }
        return null;
    }
}
