package lesson_12.abstract_factory;

public class Main {
    public static void main(String[] args) {

        CarPartsFactory bmwFactory = new BMWFactory();
        Engine bmwEngine = bmwFactory.createEngine();
        Tire bmwTire = bmwFactory.createTire();

        bmwEngine.start();
        bmwTire.roll();

        CarPartsFactory mercedesFactory = new MercedesFactory();
        Engine mercedesEngine = mercedesFactory.createEngine();
        Tire mercedesTire = mercedesFactory.createTire();

        mercedesEngine.start();
        mercedesTire.roll();
    }
}
