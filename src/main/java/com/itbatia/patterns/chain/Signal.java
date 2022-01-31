package main.java.com.itbatia.patterns.chain;

public abstract class Signal {
    private int priority;
    private Signal nextSignal;

    public Signal(int priority) {
        this.priority = priority;
    }

    public void setNextSignal(Signal nextSignal) {
        this.nextSignal = nextSignal;
    }

    public void signalManager(String alert, int level) {
        if (level >= priority) {
            write(alert);
        }
        if (nextSignal != null) {
            nextSignal.signalManager(alert, level);
        }
    }

    public abstract void write(String message);

}
