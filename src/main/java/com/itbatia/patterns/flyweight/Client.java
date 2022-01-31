package main.java.com.itbatia.patterns.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        RecruitmentAgency agency = new RecruitmentAgency();

        System.out.println("The client needed:\nTeachers - 3 persons;\nDrivers - 2 persons;\nBuilder - 1 person.\n");

        List<Worker> workers = new ArrayList<>();
        workers.add(agency.getWorkerBySpecialty("Teacher"));
        workers.add(agency.getWorkerBySpecialty("Teacher"));
        workers.add(agency.getWorkerBySpecialty("Teacher"));
        workers.add(agency.getWorkerBySpecialty("Driver"));
        workers.add(agency.getWorkerBySpecialty("Driver"));
        workers.add(agency.getWorkerBySpecialty("Builder"));

        System.out.println("Workers hired and set to work:");

        for (Worker worker : workers){
            worker.work();
        }
    }
}
