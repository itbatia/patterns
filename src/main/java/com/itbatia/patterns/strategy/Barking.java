package main.java.com.itbatia.patterns.strategy;

public class Barking implements Activity {
    @Override
    public void doIt() {
        System.out.println("Barking...");
    }
}
