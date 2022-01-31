package main.java.com.itbatia.patterns.chain;

public class AlarmSirenSignal extends Signal {
    public AlarmSirenSignal(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Pressure is critical. Security system: extreme stopped of the reactor!\n\t\t" + message);
    }
}
