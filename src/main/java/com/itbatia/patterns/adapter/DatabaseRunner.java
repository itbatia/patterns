package main.java.com.itbatia.patterns.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        DataBase dataBase = new AdapterAppToDataBase();

        dataBase.insert();
        dataBase.update();
        dataBase.select();
        dataBase.remove();
    }
}
