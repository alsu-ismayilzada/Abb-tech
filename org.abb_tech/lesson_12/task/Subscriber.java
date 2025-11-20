package lesson_12.task;

public class Subscriber implements Runnable {
    private final Publisher publisher;
    private final int id;
    private final String name;

    public Subscriber(Publisher publisher, int id) {
        this.publisher = publisher;
        this.id = id;
        this.name = "Subscriber-" + id;
    }

    public int getId() {
        return id;
    }

    public void update(String news) {
        System.out.println(name + " xəbər aldı: " + news);
    }

    @Override
    public void run() {
        while (true) {
            try {
                String news = publisher.getNews(this);
                update(news);

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(name + " dayandırıldı.");
                break;
            }
        }
    }
}