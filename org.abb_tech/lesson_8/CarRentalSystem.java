package lesson_8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class CarRentalSystem {

    private static final DateTimeFormatter DATE_TIME_FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MMM-dd HH:mm:ss");

    Set<Car> cars = new HashSet<>();
    Set<Car> freeCars = new HashSet<>();
    Map<Customer, Car> rentals = new HashMap<>();
    Map<Car, LocalDateTime> rentalTimes = new HashMap<>();
    Map<Car, LocalDateTime> expiredRentalCars = new HashMap<>();
//    Map<Car, Map<LocalDateTime, LocalDateTime>> rentalHistory = new LinkedHashMap<>();
    Map<Car, String> rentalHistory = new LinkedHashMap<>();


    public void addCar(Car car){
        cars.add(car);
        freeCars.add(car);
    }

    public void rentCar(Customer consumer, Car car){
        if(!freeCars.contains(car)){
            System.out.println("Car is not available");
        }else {
            freeCars.remove(car);
            rentals.put(consumer, car);
            rentalTimes.put(car, LocalDateTime.now());
            System.out.printf("%s rented %s/%s at %s \n", consumer.getName(), car.getBrand(), car.getModel(), rentalTimes.get(car).format(DATE_TIME_FORMATTER));
        }

    }

    public void returnCar(Customer consumer){
        freeCars.add(rentals.get(consumer));
        var car = rentals.get(consumer);
        var endTime = LocalDateTime.of(
                LocalDate.of(2025,11,13), LocalTime.now());// neticenin 0 olmaması üçün enddate manual set etdim
        Duration duration = Duration.between(rentalTimes.get(car), endTime);
        rentalHistory.put(car, String.format("%s rented from %s to %s",
                consumer.getName(), rentalTimes.get(car).format(DATE_TIME_FORMATTER), endTime.format(DATE_TIME_FORMATTER)));
        rentals.remove(consumer);
        System.out.printf("%s returned %s/%s after %d days (%s hours)%n",
                consumer.getName(), car.getBrand(), car.getModel(), duration.toDays(), duration.toHours());

    }

    public void printActiveRentals(){
        System.out.println("\nActive rentals: ");
        for(var entry : rentals.entrySet()){
            System.out.printf("%s -> %s/%s (rented at %s ) \n", entry.getKey().getName(),
                    entry.getValue().getBrand(), entry.getValue().getModel(), rentalTimes.get(entry.getValue()).format(DATE_TIME_FORMATTER));;
        }
    }

    public void printAvailableCars(){
        System.out.println("\nAvailable cars: ");
        for(var car : freeCars){
            System.out.printf("%s/%s (%s) \n", car.getBrand(), car.getModel(), car.getYear());
        }
    }

    public void printRentalHistory(){
        System.out.println("\nRental history: ");;
        for(var entry : rentalHistory.entrySet()){
            System.out.printf("%s/%s -> %s \n", entry.getKey().getBrand(), entry.getKey().getModel(), entry.getValue());
        }
    }
}
