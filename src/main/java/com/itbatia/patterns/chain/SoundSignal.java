package main.java.com.itbatia.patterns.chain;

public class SoundSignal extends Signal {
    public SoundSignal(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Pressure is very high! Security system: stopping supply of raw materials!\n\t\t" + message);
    }
}
