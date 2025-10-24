package lesson_5.model;

public class Taxi implements Transport {

    private final double ratePerKm;
    private final double speed;

    public Taxi(double ratePerKm, double speed) {
        this.ratePerKm = ratePerKm;
        this.speed = speed;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if(passengers < 4) {
            return calculateFare(distance);
        } else {
            return calculateFare(distance) * 1.2;
        }
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Taksi: hər km üçün qiymət: " + ratePerKm + "km\n" +
                "Sürət: " + speed + "km/s";
    }

}
