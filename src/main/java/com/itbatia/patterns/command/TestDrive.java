package main.java.com.itbatia.patterns.command;

public class TestDrive {
    public static void main(String[] args) {
        ToyCar toyCar = new ToyCar();

        RemoteControl control = new RemoteControl(
                new ForwardCommand(toyCar),
                new BackwardCommand(toyCar),
                new RightCommand(toyCar),
                new LeftCommand(toyCar));
        control.performForward();
        control.performBackward();
        control.performRight();
        control.performLeft();
    }
}
