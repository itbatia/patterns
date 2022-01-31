package main.java.com.itbatia.patterns.observer;

import java.util.List;

public interface Observer {
    void handleEvent (List<String> videos);
}
