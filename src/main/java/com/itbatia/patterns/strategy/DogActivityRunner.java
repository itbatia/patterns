package main.java.com.itbatia.patterns.strategy;

public class DogActivityRunner {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setActivity(new WavingTail());
        dog.executeActivity();

        dog.setActivity(new Barking());
        dog.executeActivity();

        dog.setActivity(new Eating());
        dog.executeActivity();

        dog.setActivity(new Sleeping());
        dog.executeActivity();
    }
}
