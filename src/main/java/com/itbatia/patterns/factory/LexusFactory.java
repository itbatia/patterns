package main.java.com.itbatia.patterns.factory;

public class LexusFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Lexus();
    }
}
