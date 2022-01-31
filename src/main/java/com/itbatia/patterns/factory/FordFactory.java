package main.java.com.itbatia.patterns.factory;

public class FordFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Ford();
    }
}
