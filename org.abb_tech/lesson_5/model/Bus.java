package lesson_5.model;

public class Bus implements Transport {

    private final double ratePerKm;
    private final double speed;

    public Bus(double ratePerKm, double speed) {
        this.ratePerKm = ratePerKm;
        this.speed = speed;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        return calculateFare(distance)*passengers;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Avtobus: hər km üçün qiymət: " + ratePerKm + "km\n" +
                "Sürət: " + speed + "km/s";
    }

}
