package main.java.com.itbatia.patterns.visitor;

public interface Sportsmen {
    void execute (Run run);

    void execute (Swimming swimming);

    void execute (BikeRace bikeRace);
}
