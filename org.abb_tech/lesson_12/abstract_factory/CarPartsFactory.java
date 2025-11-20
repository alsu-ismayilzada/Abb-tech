package lesson_12.abstract_factory;

public interface CarPartsFactory {

    public Tire createTire();
    public Engine createEngine();
}
