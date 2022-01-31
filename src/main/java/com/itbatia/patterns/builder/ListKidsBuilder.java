package main.java.com.itbatia.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class ListKidsBuilder {

    private List<Children> listKids = new ArrayList<>();

    public List<Children> addListKids(String name, int age) {
        listKids.add(new Children(name, age));
        return listKids;
    }

    public List<Children> getListKids() {
        return listKids;
    }
}
