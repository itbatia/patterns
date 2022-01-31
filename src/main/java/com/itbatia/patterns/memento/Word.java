package main.java.com.itbatia.patterns.memento;

import java.time.LocalTime;

public class Word {
    private String version;
    private LocalTime time;
    public static boolean autoSave = true;

    public void setVersionAndTime(String version) {
        this.version = version;
        this.time = LocalTime.now();
    }

    public Save save() {
        return new Save(version);
    }

    public void autoSave(LocalDirectory directory) throws InterruptedException {
        int i = 0;
        while (autoSave) {
            this.setVersionAndTime("Version " + i);
            this.save();
            directory.setSave(this.save());
            i++;
            System.out.println("Word document " + version + " saved.");
            Thread.sleep(3000);
        }
    }

    public void load(Save save) {
        version = save.getVersion();
        time = save.getTime();
    }

    @Override
    public String toString() {
        return "Word: \n" + "version: " + version + "\ntime: " + time + "\n";
    }
}
