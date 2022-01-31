package main.java.com.itbatia.patterns.flyweight;

public class Builder implements Worker{
    @Override
    public void work() {
        System.out.println("Builder builds object...");
    }
}
