package main.java.com.itbatia.patterns.bridge;

public class WorkTripToEstonia extends WorkTrip{
    protected WorkTripToEstonia(Employee employee) {
        super(employee);
    }

    @Override
    public void construction() {
        System.out.println("Building construction in Estonia in progress ...");
        employee.work();
    }
}
