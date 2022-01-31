package main.java.com.itbatia.patterns.observer;

public class YoutubeChannelRunner {
    public static void main(String[] args) {

        PROSELYTE_YoutubeChannel canal = new PROSELYTE_YoutubeChannel();
        canal.addVideo("Java Design Patterns");
        canal.addVideo("Data Structures");

        Observer firstSubscriber = new Subscriber("Maksim Petrov");
        Observer secondSubscriber = new Subscriber("Oleg Gazmanov");

        canal.addObserver(firstSubscriber);
        canal.addObserver(secondSubscriber);

        System.out.println("Added video to channel:\n");
        canal.addVideo("LeetCode solutions");

        System.out.println("\nRemoved video from channel:\n");
        canal.removeVideo("LeetCode solutions");

        canal.removeObserver(secondSubscriber);
    }
}
