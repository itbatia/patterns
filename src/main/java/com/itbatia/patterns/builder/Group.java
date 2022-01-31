package main.java.com.itbatia.patterns.builder;

import java.util.List;

public class Group {
    private Title title;
    private Educator educator;
    private int amountKids;
    private List<Children> listKids;

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setEducator(Educator educator) {
        this.educator = educator;
    }

    public void setAmountKids(int amountKids) {
        this.amountKids = amountKids;
    }

    public void setListKids(List<Children> listKids) {
        this.listKids = listKids;
    }

    @Override
    public String toString() {
        return "Group{" +
                "title=" + title +
                ", educator=" + educator +
                ", amountKids=" + amountKids +
                ", \nlistKids=" + listKids +
                '}';
    }
}
