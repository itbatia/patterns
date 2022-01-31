package main.java.com.itbatia.patterns.template;

public class WorkingDayRunner {
    public static void main(String[] args) {
        WorkingDayDeveloper javaDeveloper = new WorkingDayJavaDeveloper();
        WorkingDayDeveloper cppDeveloper = new WorkingDayCppDeveloper();

        javaDeveloper.work();
        System.out.println("---------------------");
        cppDeveloper.work();
    }
}
