package main.java.com.itbatia.patterns.state;

public class ActivityWoman {
    public static void main(String[] args) {
        Mood mood = new Mysterious();
        Woman woman = new Woman();

        woman.setMood(mood);

        for (int i = 0; i < 10; i ++){
            woman.justDoIt();
            woman.changeMood();
        }
    }
}
