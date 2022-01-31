package main.java.com.itbatia.patterns.memento;

public class LocalDirectory {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}
