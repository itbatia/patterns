package main.java.com.itbatia.patterns.abstractFactory.sportCar;

import main.java.com.itbatia.patterns.abstractFactory.Nissan;

public class NissanGTR implements Nissan {
    @Override
    public void nissanRides() {
        System.out.println("Nissan GT-R came to race sport cars");
    }
}
