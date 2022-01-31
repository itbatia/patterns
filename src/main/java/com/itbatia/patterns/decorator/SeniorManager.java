package main.java.com.itbatia.patterns.decorator;

public class SeniorManager extends WorkerDecorator {

    public SeniorManager(Worker worker) {
        super(worker);
    }
    public String trainsManagers (){
        return "Trains managers. ";
    }

    @Override
    public String work() {
        return super.work() + trainsManagers();
    }
}
