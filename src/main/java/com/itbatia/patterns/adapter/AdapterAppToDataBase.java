package main.java.com.itbatia.patterns.adapter;

public class AdapterAppToDataBase extends ConsoleCRUDApp implements DataBase {
    @Override
    public void insert() {
        save();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        getById();
    }

    @Override
    public void remove() {
        delete();
    }
}
