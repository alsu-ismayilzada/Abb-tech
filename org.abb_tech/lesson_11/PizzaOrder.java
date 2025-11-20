package lesson_11;

import java.time.Duration;
import java.time.LocalDateTime;

public class PizzaOrder {

    public long preparePizza(Order order){
        LocalDateTime startTime = LocalDateTime.now();

        printMessage(order.getName() + " Started.");
        printMessage(order.getName() + " Preparing pizza...");
        sleepRandom(1000, 3000);
        printMessage(order.getName() + " Preparation complete.");
        printMessage(order.getName() + " Baking pizza...");
        sleepRandom(3000, 6000);
        printMessage(order.getName() + " Baking complete.");
        printMessage(order.getName() + " Delivering pizza to customer...");
        sleepRandom(2000, 5000);
        printMessage(order.getName() + " Pizza delivered!");

        var duration = Duration.between(startTime, LocalDateTime.now());
        printMessage("Total time for " + order.getName() + ": " + duration.toSeconds() + " seconds");

        return duration.toSeconds();
    }

    public void printMessage(String message){
        synchronized (System.out){
            System.out.println(message);
        }
    }

    public void sleepRandom(int min, int max){
        try {
            int duration = min + (int)(Math.random() * (max - min));
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
