package lesson_12.iterator;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "F30","red");
        Car car2 = new Car("Porsche", "911","green");
        Car car3 = new Car("Tesla", "Y","white");

        CarIterator carIterator = new CarIterator(List.of(car1, car2, car3));

        while (carIterator.hasNext()) {
            Car car = carIterator.next();
            System.out.println(car);
        }
    }
}
