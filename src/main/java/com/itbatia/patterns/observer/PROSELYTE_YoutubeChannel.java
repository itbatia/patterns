package main.java.com.itbatia.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class PROSELYTE_YoutubeChannel implements Observed {

    List<String> videos = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();

    public void addVideo(String video) {
        this.videos.add(video);
        notifyObservers();
    }

    public void removeVideo(String video) {
        this.videos.remove(video);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : subscribers){
            observer.handleEvent(videos);
        }
    }
}
