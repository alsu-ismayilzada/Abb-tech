package lesson_8;

import java.time.Year;

public class Main {

    public static void main(String[] args) {

        CarRentalSystem system = new CarRentalSystem();

        Car porsche = new Car(1L,"Porsche","911", Year.of(2021));
        Car tesla = new Car(2L,"Tesla","Model S", Year.of(2025));
        Car audi = new Car(3L,"Audi","A4", Year.of(2019));
        Car hundai = new Car(4L,"Hundai","Tucson", Year.of(2023));

        system.addCar(porsche);
        system.addCar(tesla);
        system.addCar(audi);
        system.addCar(hundai);

        Customer alsu = new Customer(1L, "Alsu", "1234567890");
        Customer martin = new Customer(2L, "Martin", "123454321");
        Customer ayan = new Customer(3L, "Ayan", "987654321");

        system.rentCar(alsu, porsche);
        system.rentCar(martin, tesla);
        system.printActiveRentals();
        system.printAvailableCars();
        system.returnCar(martin);
        system.printRentalHistory();
        system.printAvailableCars();

    }
}
