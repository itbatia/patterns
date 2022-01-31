package main.java.com.itbatia.patterns.flyweight;

public class Driver implements Worker{
    @Override
    public void work() {
        System.out.println("Driver drives the car...");
    }
}
