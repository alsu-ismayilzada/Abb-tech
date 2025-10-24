package lesson_5.model;

public class Bicycle implements Transport {

    private final double ratePerKm;
    private final double speed;

    public Bicycle(double ratePerKm, double speed) {
        this.ratePerKm = ratePerKm;
        this.speed = speed;
    }

    @Override
    public double calculateFare(double distance) {
        var fare = distance * ratePerKm;
        return Math.round(fare);
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
        return "Bicycle: hər km üçün qiymət: " + ratePerKm + "km\n" +
                "Sürət: " + speed + "km/s";
    }


}
