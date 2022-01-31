package main.java.com.itbatia.patterns.command;

public class RemoteControl {
    Command forward;
    Command backward;
    Command right;
    Command left;

    public RemoteControl(Command forward, Command backward, Command right, Command left) {
        this.forward = forward;
        this.backward = backward;
        this.right = right;
        this.left = left;
    }

    public void performForward() {
        forward.execute();
    }

    public void performBackward() {
        backward.execute();
    }

    public void performRight() {
        right.execute();
    }

    public void performLeft() {
        left.execute();
    }
}
