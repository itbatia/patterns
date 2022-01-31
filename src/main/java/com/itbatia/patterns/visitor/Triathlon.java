package main.java.com.itbatia.patterns.visitor;

public class Triathlon implements TriathlonStage {

    TriathlonStage[] triathlonStages = {
            new Run(),
            new Swimming(),
            new BikeRace()
    };

    @Override
    public void beExecute(Sportsmen sportsmen) {
        for (TriathlonStage stage : triathlonStages) {
            stage.beExecute(sportsmen);
        }
    }
}
