package main.java.com.itbatia.patterns.flyweight;

public class Teacher implements Worker{
    @Override
    public void work() {
        System.out.println("Teacher conducts classes...");
    }
}
