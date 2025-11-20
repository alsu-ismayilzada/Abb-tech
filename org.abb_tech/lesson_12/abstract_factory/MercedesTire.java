package lesson_12.abstract_factory;

public class MercedesTire implements Tire {

    @Override
    public void roll() {
        System.out.println("MercedesEngine is rolling...");
    }
}
