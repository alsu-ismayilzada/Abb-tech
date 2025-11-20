package lesson_12.abstract_factory;

public class BMWFactory implements CarPartsFactory {

    @Override
    public Tire createTire() {
        return new BMWTire();
    }

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }
}
