package main.java.com.itbatia.patterns.abstractFactory.smallCar;

import main.java.com.itbatia.patterns.abstractFactory.Nissan;

public class NissanMicra implements Nissan {
    @Override
    public void nissanRides() {
        System.out.println("Nissan Micra came to race small cars");
    }
}
