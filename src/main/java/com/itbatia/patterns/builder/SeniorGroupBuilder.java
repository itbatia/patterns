package main.java.com.itbatia.patterns.builder;

public class SeniorGroupBuilder extends GroupBuilder {
    ListKidsBuilder listKidsBuilder = new ListKidsBuilder();

    @Override
    void buildTitle() {
        group.setTitle(Title.SUN);
    }

    @Override
    void buildEducator() {
        group.setEducator(Educator.MARIA_IVANOVNA);
    }

    @Override
    void buildListKids() {
        listKidsBuilder.addListKids("Olya", 6);
        listKidsBuilder.addListKids("Nikita", 6);
        listKidsBuilder.addListKids("Anton", 6);
        listKidsBuilder.addListKids("Ira", 5);
        listKidsBuilder.addListKids("Eugene", 4);
        listKidsBuilder.addListKids("Anya", 5);
        listKidsBuilder.addListKids("Anton", 6);
        listKidsBuilder.addListKids("Ira", 5);
        listKidsBuilder.addListKids("Eugene", 6);
        listKidsBuilder.addListKids("Kirill", 6);
        group.setListKids(listKidsBuilder.getListKids());
    }

    @Override
    void buildAmountKids() {
        group.setAmountKids(10);
    }
}