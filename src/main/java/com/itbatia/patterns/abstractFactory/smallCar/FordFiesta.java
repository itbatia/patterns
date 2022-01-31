package main.java.com.itbatia.patterns.abstractFactory.smallCar;

import main.java.com.itbatia.patterns.abstractFactory.Ford;

public class FordFiesta implements Ford {
    @Override
    public void fordRides() {
        System.out.println("Ford Fiesta came to race small cars");
    }
}
