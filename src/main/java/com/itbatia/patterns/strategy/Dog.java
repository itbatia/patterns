package main.java.com.itbatia.patterns.strategy;

public class Dog {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void executeActivity (){
        activity.doIt();
    }
}
