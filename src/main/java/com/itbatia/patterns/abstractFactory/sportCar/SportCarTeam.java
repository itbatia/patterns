package main.java.com.itbatia.patterns.abstractFactory.sportCar;

import main.java.com.itbatia.patterns.abstractFactory.Ford;
import main.java.com.itbatia.patterns.abstractFactory.Lexus;
import main.java.com.itbatia.patterns.abstractFactory.Nissan;
import main.java.com.itbatia.patterns.abstractFactory.RaceParticipants;

public class SportCarTeam implements RaceParticipants {
    @Override
    public Ford getFord() {
        return new FordGT();
    }

    @Override
    public Lexus getLexus() {
        return new LexusRC();
    }

    @Override
    public Nissan getNissan() {
        return new NissanGTR();
    }
}
