package main.java.com.itbatia.patterns.сomposite;

import java.util.ArrayList;
import java.util.List;

public class SportsRelay {
    public static void main(String[] args) {
        Team_Strela team1 = new Team_Strela();
        team1.addAthlete(new Athlete_1("Yuri"));
        team1.addAthlete(new Athlete_2("Zaur"));
        team1.addAthlete(new Athlete_3("Andrey"));
        team1.addAthlete(new Athlete_4("Maksim"));

        Team_Raketa team2 = new Team_Raketa();
        team2.addAthlete(new Athlete_1("Anton"));
        team2.addAthlete(new Athlete_2("Eugene"));
        team2.addAthlete(new Athlete_3("Olga"));
        team2.addAthlete(new Athlete_4("Marina"));

        List<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);

        for (Team team : teams) {
            team.teamRuns();
        }
    }
}

