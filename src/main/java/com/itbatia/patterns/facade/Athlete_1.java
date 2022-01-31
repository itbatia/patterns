package main.java.com.itbatia.patterns.facade;

public class Athlete_1 implements Athlete {

    private String name;

    public Athlete_1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Athlete 1 - %s started first...\n", name);
    }
}
