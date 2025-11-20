package lesson_12.iterator;

import java.util.ArrayList;
import java.util.List;

public class CarIterator implements Iterator<Car> {

    public List<Car> cars = new ArrayList<Car>();
    public int index = 0;

    public CarIterator(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public boolean hasNext() {
        if (index < cars.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Car next() {
        return cars.get(index++);
    }
}
