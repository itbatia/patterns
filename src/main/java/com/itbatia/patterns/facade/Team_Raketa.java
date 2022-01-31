package main.java.com.itbatia.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class Team_Raketa implements Team {

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
        System.out.println("\tTeam Raketa started in the sports relay race!");
        for (Athlete athlete : athletes) {
            athlete.run();
        }
    }
}
