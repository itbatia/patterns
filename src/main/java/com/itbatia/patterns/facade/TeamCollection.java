package main.java.com.itbatia.patterns.facade;

import java.util.ArrayList;
import java.util.List;

public class TeamCollection {
    Team_Strela team1 = new Team_Strela();
    Team_Raketa team2 = new Team_Raketa();

    public void addAthleteInTeam (){
        team1.addAthlete(new Athlete_1("Yuri"));
        team1.addAthlete(new Athlete_2("Zaur"));
        team1.addAthlete(new Athlete_3("Andrey"));
        team1.addAthlete(new Athlete_4("Maksim"));
        team2.addAthlete(new Athlete_1("Anton"));
        team2.addAthlete(new Athlete_2("Eugene"));
        team2.addAthlete(new Athlete_3("Olga"));
        team2.addAthlete(new Athlete_4("Marina"));
    }
    public void relayStarts (){
        addAthleteInTeam();
        List<Team> teams = new ArrayList<>();
        teams.add(team1);
        teams.add(team2);

        for (Team team : teams) {
            team.teamRuns();
        }
    }
}
