package main.java.com.itbatia.patterns.abstractFactory;

import main.java.com.itbatia.patterns.abstractFactory.smallCar.SmallCarTeam;

public class SmallCarRacing {
    public static void main(String[] args) {
        RaceParticipants raceParticipants = new SmallCarTeam();

        Ford ford = raceParticipants.getFord();
        Lexus lexus = raceParticipants.getLexus();
        Nissan nissan = raceParticipants.getNissan();

        System.out.println("Big races of small cars start today ...");
        ford.fordRides();
        lexus.lexusRides();
        nissan.nissanRides();
    }
}
