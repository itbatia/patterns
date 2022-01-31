package main.java.com.itbatia.patterns.сomposite;

public class Athlete_2 implements Athlete {

    private String name;

    public Athlete_2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Athlete 2 - %s is waiting for the baton...\n", name);
    }
}
