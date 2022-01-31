package main.java.com.itbatia.patterns.builder;

public abstract class GroupBuilder {
    Group group;

    void createGroup() {
        group = new Group();
    }

    abstract void buildTitle();

    abstract void buildEducator();

    abstract void buildListKids();

    abstract void buildAmountKids();

    Group getGroup (){
        return group;
    }
}
