package main.java.com.itbatia.patterns.template;

public abstract class WorkingDayDeveloper {

    public void work() {
        System.out.println("Coming to work at 8:00");
        showWork();
        System.out.println("Finishes work at 17.00");
    }

    public abstract void showWork();
}
