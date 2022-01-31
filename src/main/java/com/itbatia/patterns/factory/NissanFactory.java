package main.java.com.itbatia.patterns.factory;

public class NissanFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Nissan();
    }
}
