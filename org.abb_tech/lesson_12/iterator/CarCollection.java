package lesson_12.iterator;

import java.util.ArrayList;
import java.util.List;

public class CarCollection implements MyIterable {

    public List<Car> cars ;
    public int index = 0;

    public CarCollection(int size) {
        cars = new ArrayList<>(size);
    }

    public void add(Car car) {
        cars.add(car);
    }


    @Override
    public Iterator<Car> createIterator() {
        return new CarIterator(cars);
    }
}
