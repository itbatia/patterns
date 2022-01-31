package main.java.com.itbatia.patterns.visitor;

public class Run implements TriathlonStage {
    @Override
    public void beExecute(Sportsmen sportsmen) {
        sportsmen.execute(this);
    }
}
