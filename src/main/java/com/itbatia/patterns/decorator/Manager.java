package main.java.com.itbatia.patterns.decorator;

public class Manager implements Worker {
    @Override
    public String work() {
        return "Works with clients. ";
    }
}
