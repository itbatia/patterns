package main.java.com.itbatia.patterns.сomposite;

import java.util.ArrayList;
import java.util.List;

public class Team_Strela implements Team {

    private List<Athlete> athletes = new ArrayList<>();

    @Override
    public void addAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    @Override
    public void removeAthlete(Athlete athlete) {
        athletes.remove(athlete);
    }

    @Override
    public void teamRuns() {
        System.out.println("\tTeam Strela started in the sports relay race!");
        for (Athlete athlete : athletes) {
            athlete.run();
        }
    }
}
