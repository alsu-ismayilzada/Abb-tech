package lesson_5.enums;

public enum TransportType {
    BUS("Avtobus"),
    TAXI("Taksi"),
    BICYCLE("Velosiped"),
    SCOOTER("Skuter");

    private final String name;

    TransportType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
