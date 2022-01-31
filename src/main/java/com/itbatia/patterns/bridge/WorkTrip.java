package main.java.com.itbatia.patterns.bridge;

public abstract class WorkTrip {
    protected Employee employee;

    protected WorkTrip(Employee employee) {
        this.employee = employee;
    }
    public abstract void construction();
}
