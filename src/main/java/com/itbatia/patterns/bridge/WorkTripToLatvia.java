package main.java.com.itbatia.patterns.bridge;

public class WorkTripToLatvia extends WorkTrip {
    protected WorkTripToLatvia(Employee employee) {
        super(employee);
    }

    @Override
    public void construction() {
        System.out.println("Building construction in Latvia in progress ...");
        employee.work();
    }
}
