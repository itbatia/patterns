package main.java.com.itbatia.patterns.memento;

public class WordRunner {
    public static void main(String[] args) throws InterruptedException {
        Word word = new Word();
        LocalDirectory directory = new LocalDirectory();

        word.setVersionAndTime("Version 1.0");
        directory.setSave(word.save());
        System.out.println("Word document created and saved under the version 1.0");
        System.out.println(word);

        Thread.sleep(3000);
        System.out.println("Time has passed...\n");
        Thread.sleep(3000);

        word.setVersionAndTime("Version 2.0");
        directory.setSave(word.save());
        System.out.println("Word document created and saved under the version 2.0");
        System.out.println(word);

        Thread.sleep(1500);
        System.out.println("Time has passed...\n");
        Thread.sleep(1500);

        System.out.println("If necessary, we can download the latest saved version: ");
        word.load(directory.getSave());
        System.out.println(word);

        Thread.sleep(3000);
        System.out.println("Time has passed... Check autosave:\n");
        Thread.sleep(3000);

        new Thread(() -> {
            try {
                word.autoSave(directory);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(14000);
        Word.autoSave = false;

        Thread.sleep(1500);
        System.out.println("Time has passed...\n");
        Thread.sleep(1500);

        System.out.println("If necessary, we can download the latest saved version: ");
        word.load(directory.getSave());
        System.out.println(word);
    }
}
