package main.java.com.itbatia.patterns.factory;

public class RaceWinner {
    static CarFactory carFactoryByModel(String model) {
        if (model.equalsIgnoreCase("Ford")) {
            return new FordFactory();
        } else if (model.equalsIgnoreCase("Lexus")) {
            return new LexusFactory();
        } else if (model.equalsIgnoreCase("Nissan")) {
            return new NissanFactory();
        } else {
            throw new RuntimeException(model + " is not racing");
        }
    }

    public static void main(String[] args) {
        CarFactory carFactory = carFactoryByModel("lexus");

        Car car = carFactory.createCar();
        car.winsRace();
    }
}
