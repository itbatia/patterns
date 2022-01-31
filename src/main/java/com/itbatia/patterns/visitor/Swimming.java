package main.java.com.itbatia.patterns.visitor;

public class Swimming implements TriathlonStage {
    @Override
    public void beExecute(Sportsmen sportsmen) {
        sportsmen.execute(this);
    }
}
