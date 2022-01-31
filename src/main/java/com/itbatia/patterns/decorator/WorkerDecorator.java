package main.java.com.itbatia.patterns.decorator;

public class WorkerDecorator implements Worker {

    Worker worker;

    public WorkerDecorator(Worker worker) {
        this.worker = worker;
    }

    @Override
    public String work() {
        return worker.work();
    }
}
