package main.java.com.itbatia.patterns.bridge;

public class WorkTripCreator {
    public static void main(String[] args) {
        WorkTrip[] workTrips = {
                new WorkTripToEstonia(new Builder()),
                new WorkTripToLatvia(new Installer())
        };
        for (WorkTrip workTrip : workTrips) {
            workTrip.construction();
        }
    }
}
