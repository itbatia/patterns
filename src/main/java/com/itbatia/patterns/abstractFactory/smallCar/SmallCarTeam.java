package main.java.com.itbatia.patterns.abstractFactory.smallCar;

import main.java.com.itbatia.patterns.abstractFactory.Ford;
import main.java.com.itbatia.patterns.abstractFactory.Lexus;
import main.java.com.itbatia.patterns.abstractFactory.Nissan;
import main.java.com.itbatia.patterns.abstractFactory.RaceParticipants;

public class SmallCarTeam implements RaceParticipants {
    @Override
    public Ford getFord() {
        return new FordFiesta();
    }

    @Override
    public Lexus getLexus() {
        return new LexusLF();
    }

    @Override
    public Nissan getNissan() {
        return new NissanMicra();
    }
}
