package main.java.com.itbatia.patterns.abstractFactory;

import main.java.com.itbatia.patterns.abstractFactory.sportCar.SportCarTeam;

public class SportsCarRacing {
    public static void main(String[] args) {
        RaceParticipants raceParticipants = new SportCarTeam();

        Ford ford = raceParticipants.getFord();
        Lexus lexus = raceParticipants.getLexus();
        Nissan nissan = raceParticipants.getNissan();

        System.out.println("Big race starts today ...");
        ford.fordRides();
        lexus.lexusRides();
        nissan.nissanRides();
    }
}
