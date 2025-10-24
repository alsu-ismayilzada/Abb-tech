package lesson_5.model;

public class Scooter implements Transport {

    private final double ratePerKm;
    private final double speed;

    public Scooter(double ratePerKm, double speed) {
        this.ratePerKm = ratePerKm;
        this.speed = speed;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * this.ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance);

    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Skooter: hər km üçün qiymət: " + ratePerKm + "km\n" +
                "Sürət: " + speed + "km/s";
    }

}
