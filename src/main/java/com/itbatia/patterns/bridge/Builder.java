package main.java.com.itbatia.patterns.bridge;

public class Builder implements Employee{
    @Override
    public void work() {
        System.out.println("builder builds building ...");
    }
}
