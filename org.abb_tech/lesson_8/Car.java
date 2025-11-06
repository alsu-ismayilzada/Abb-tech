package lesson_8;

import java.time.Year;
import java.util.Objects;

public class Car {

    private Long id;
    private String brand;
    private String model;
    private Year year;

    public Car(Long id, String brand, String model, Year year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }
}
