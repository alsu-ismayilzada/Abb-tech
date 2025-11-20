package lesson_12.task;

public class Main {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber s1 = new Subscriber(publisher, 1);
        Subscriber s2 = new Subscriber(publisher, 2);
        Subscriber s3 = new Subscriber(publisher, 3);

        Thread t = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);

        publisher.subscribe(s1);
        publisher.subscribe(s2);
        publisher.subscribe(s3);

        t.start();
        t2.start();
        t3.start();

        int newsCount = 1;

        try {
            while (true) {
                Thread.sleep(2000);
                String news = "Xəbər #" + newsCount++;
                publisher.publishNews(news);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main thread dayandırıldı.");
        }
    }
}