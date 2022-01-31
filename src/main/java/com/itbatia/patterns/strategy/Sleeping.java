package main.java.com.itbatia.patterns.strategy;

public class Sleeping implements Activity {
    @Override
    public void doIt() {
        System.out.println("Sleeping...");
    }
}
