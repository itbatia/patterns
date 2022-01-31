package main.java.com.itbatia.patterns.сomposite;

public class Athlete_4 implements Athlete {

    private String name;

    public Athlete_4(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Athlete 4 - %s is waiting for the baton...\n\n", name);
    }
}
