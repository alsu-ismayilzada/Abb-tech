package lesson_11;

public class Order {

    private int id;
    private String name;

    public Order(int id) {
        this.id = id;
        this.name = "Order #" + id;
    }

    public String getName() {
        return name;
    }
}
