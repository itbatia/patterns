package main.java.com.itbatia.patterns.builder;

public class MiddleGroupBuilder extends GroupBuilder {
    ListKidsBuilder listKidsBuilder = new ListKidsBuilder();

    @Override
    void buildTitle() {
        group.setTitle(Title.PINK);
    }

    @Override
    void buildEducator() {
        group.setEducator(Educator.EKATERINA_PETROVNA);
    }

    @Override
    void buildListKids() {
        listKidsBuilder.addListKids("Anya", 4);
        listKidsBuilder.addListKids("Kolya", 5);
        listKidsBuilder.addListKids("Anton", 3);
        listKidsBuilder.addListKids("Ira", 5);
        group.setListKids(listKidsBuilder.getListKids());
    }

    @Override
    void buildAmountKids() {
        group.setAmountKids(4);
    }
}