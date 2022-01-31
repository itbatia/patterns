package main.java.com.itbatia.patterns.builder;

public class JuniorGroupBuilder extends GroupBuilder {
    ListKidsBuilder listKidsBuilder = new ListKidsBuilder();

    @Override
    void buildTitle() {
        group.setTitle(Title.FLOWER);
    }

    @Override
    void buildEducator() {
        group.setEducator(Educator.IRINA_SERGEEVNA);
    }

    @Override
    void buildListKids() {
        listKidsBuilder.addListKids("Olya", 3);
        listKidsBuilder.addListKids("Nikita", 4);
        listKidsBuilder.addListKids("Anton", 3);
        listKidsBuilder.addListKids("Ira", 3);
        listKidsBuilder.addListKids("Eugene", 4);
        group.setListKids(listKidsBuilder.getListKids());
    }

    @Override
    void buildAmountKids() {
        group.setAmountKids(5);
    }
}
