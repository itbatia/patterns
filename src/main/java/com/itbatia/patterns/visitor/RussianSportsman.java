package main.java.com.itbatia.patterns.visitor;

public class RussianSportsman implements Sportsmen {

    @Override
    public void execute(Run run) {
        System.out.println("Ran this stage in 10 hour 25 minutes.");
    }

    @Override
    public void execute(Swimming swimming) {
        System.out.println("Swam this stage in 1 hour 40 minutes.");
    }

    @Override
    public void execute(BikeRace bikeRace) {
        System.out.println("Passed this stage in 8 hour 10 minutes.");
    }
}
