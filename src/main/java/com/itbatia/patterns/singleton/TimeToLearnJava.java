package main.java.com.itbatia.patterns.singleton;

import java.time.LocalDate;

public class TimeToLearnJava {
    private static TimeToLearnJava timeToLearnJava;
    private static int fullTimeStudy = 0;
    private static String trainingInformation = "";

    public static TimeToLearnJava getTimeToLearnJava() {
        if (timeToLearnJava == null) {
            timeToLearnJava = new TimeToLearnJava();
        }
        return timeToLearnJava;
    }

    private TimeToLearnJava() {

    }

    public void timePerGay(Integer time) {
        trainingInformation += LocalDate.now() + ": " + time + " hours;\n";
        fullTimeStudy += time;
    }
    public void showTrainingInformation (){
        System.out.println("Report for the entire period of learning to program in Java with " +
                "Evgeny Suleimanov:\n\n" + trainingInformation + "\nTotal number of training hours: " + fullTimeStudy);
    }
}
