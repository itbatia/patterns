package main.java.com.itbatia.patterns.builder;

public class Director {
    GroupBuilder builder;

    public void setBuilder(GroupBuilder builder) {
        this.builder = builder;
    }

    Group buildGroup() {
        builder.createGroup();
        builder.buildAmountKids();
        builder.buildTitle();
        builder.buildEducator();
        builder.buildListKids();
        return builder.getGroup();
    }
}
