package main.java.com.itbatia.patterns.command;

public class BackwardCommand implements Command {

    ToyCar toyCar;

    public BackwardCommand(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.backward();
    }
}
