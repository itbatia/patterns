package main.java.com.itbatia.patterns.command;

public class LeftCommand implements Command {

    ToyCar toyCar;

    public LeftCommand(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.left();
    }
}
