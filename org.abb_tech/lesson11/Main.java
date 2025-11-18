package lesson11;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Main {

    public static void main() throws InterruptedException {
        PizzaOrder pizzaOrder = new PizzaOrder();
        Order order1 = new Order(1);
        Order order2 = new Order(2);
        Order order3 = new Order(3);
        Order order4 = new Order(4);
        Order order5 = new Order(5);

        List<Order> orders = List.of(order1, order2, order3, order4, order5);

        Thread[] threads = new Thread[5];

        AtomicReference<Order> fastestOrder = new AtomicReference<>();
        AtomicReference<Long> fastestTime = new AtomicReference<>(Long.MAX_VALUE);

        for (int i = 0; i < orders.size(); i++) {
            final Order order = orders.get(i);
            threads[i] = new Thread(() -> {
                long duration = pizzaOrder.preparePizza(order);
                synchronized (fastestTime) {
                    if (duration < fastestTime.get()) {
                        fastestTime.set(duration);
                        fastestOrder.set(order);
                    }
                }
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("All orders completed!");
        System.out.println("Fastest order: " + fastestOrder.get().getName() + " (" + fastestTime.get() + " ms)");

    }
}
