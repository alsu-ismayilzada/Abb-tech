package lesson_12.abstract_factory;

public class BMWTire implements Tire{

    @Override
    public void roll() {
        System.out.println("BMWTire is rolling...");
    }
}
