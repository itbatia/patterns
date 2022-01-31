package main.java.com.itbatia.patterns.abstractFactory.sportCar;

import main.java.com.itbatia.patterns.abstractFactory.Ford;

public class FordGT implements Ford {
    @Override
    public void fordRides() {
        System.out.println("Ford GT came to race sport cars");
    }
}
