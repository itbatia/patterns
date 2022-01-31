package main.java.com.itbatia.patterns.сomposite;

public class Athlete_3 implements Athlete {

    private String name;

    public Athlete_3(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Athlete 3 - %s is waiting for the baton...\n", name);
    }
}
