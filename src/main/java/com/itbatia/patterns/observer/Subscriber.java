package main.java.com.itbatia.patterns.observer;

import java.util.List;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> videos) {
        System.out.println("Dear " + name + ", new videos have appeared on Eugene Suleimanov's website.");
        System.out.println("Here is playlist: \n" + videos);
        System.out.println("--------------------------------------------------------------------------");
    }
}
