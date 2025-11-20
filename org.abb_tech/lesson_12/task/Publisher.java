package lesson_12.task;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews = null;

    public synchronized void publishNews(String news) {
        this.latestNews = news;

        System.out.println("Publisher: Yeni xəbər yayımlandı -> " + news);

        notifyAll();
    }

    public synchronized String getNews(Subscriber subscriber) throws InterruptedException {
        while (latestNews == null) {
            wait();
        }

        String newsToDeliver = this.latestNews;
        this.latestNews = null;

        return newsToDeliver;
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
}