package main.java.com.itbatia.patterns.decorator;

public class Task {
    public static void main(String[] args) {
        Worker worker = new DepartmentHead(new SeniorManager(new Manager()));

        System.out.println(worker.work());
    }
}
