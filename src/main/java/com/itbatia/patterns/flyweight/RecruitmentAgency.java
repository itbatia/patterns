package main.java.com.itbatia.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class RecruitmentAgency {
    private static final Map<String, Worker> workers = new HashMap<>();

    public Worker getWorkerBySpecialty(String specialty) {
        Worker worker = workers.get(specialty);

        if (worker == null) {
            switch (specialty) {
                case "Teacher":
                    worker = new Teacher();
                    break;
                case "Driver":
                    worker = new Driver();
                    break;
                case "Builder":
                    worker = new Builder();
                    break;
            }
            workers.put(specialty, worker);
        }
        return worker;
    }
}
