package main.java.com.itbatia.patterns.state;

public class Woman {
    Mood mood;

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public void changeMood() {
        if (mood instanceof Mysterious) {
            setMood(new Happy());
        } else if (mood instanceof Happy) {
            setMood(new Sad());
        } else if (mood instanceof Sad) {
            setMood(new Cheerful());
        } else if (mood instanceof Cheerful) {
            setMood(new Mysterious());
        }
    }

    public void justDoIt() {
        mood.justDoIt();
    }
}
