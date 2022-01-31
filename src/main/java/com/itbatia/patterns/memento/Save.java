package main.java.com.itbatia.patterns.memento;

import java.time.LocalTime;

public class Save {
    private final String version;
    private final LocalTime time;

    public Save(String version) {
        this.version = version;
        this.time = LocalTime.now();
    }

    public String getVersion() {
        return version;
    }

    public LocalTime getTime() {
        return time;
    }
}
