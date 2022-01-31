package main.java.com.itbatia.patterns.command;

public class RightCommand implements Command {

    ToyCar toyCar;

    public RightCommand(ToyCar toyCar) {
        this.toyCar = toyCar;
    }

    @Override
    public void execute() {
        toyCar.right();
    }
}
