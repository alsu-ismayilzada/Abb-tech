package lesson_12.abstract_factory;

public class MercedesFactory implements CarPartsFactory {

    @Override
    public Tire createTire() {
        return new MercedesTire();
    }

    @Override
    public Engine createEngine() {
        return new MercedesEngine();
    }
}
