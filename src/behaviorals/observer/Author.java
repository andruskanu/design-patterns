package behaviorals.observer;

import java.util.ArrayList;
import java.util.List;

public class Author implements Observable{

    private List<Observer> subscribers;
    private String article;

    public Author() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer element : subscribers) {
            element.articlePublished(article);
        }
    }

    public void writeArticle(String article) {
        this.article = article;
        notifyObservers();
    }
}
