package main.java.com.itbatia.patterns.command;

public class ForwardCommand implements Command {

    ToyCar toyCar;

    public ForwardCommand(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.forward();
    }
}
