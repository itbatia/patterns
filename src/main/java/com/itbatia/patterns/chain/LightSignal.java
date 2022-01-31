package main.java.com.itbatia.patterns.chain;

public class LightSignal extends Signal {
    public LightSignal(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Pressure increases! Security system: adding a catalyst!\n\t\t" + message);
    }
}
