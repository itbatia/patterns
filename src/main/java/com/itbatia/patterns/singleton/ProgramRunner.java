package main.java.com.itbatia.patterns.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        TimeToLearnJava.getTimeToLearnJava().timePerGay(3);
        TimeToLearnJava.getTimeToLearnJava().timePerGay(5);
        TimeToLearnJava.getTimeToLearnJava().timePerGay(7);
        TimeToLearnJava.getTimeToLearnJava().showTrainingInformation();
    }
}
