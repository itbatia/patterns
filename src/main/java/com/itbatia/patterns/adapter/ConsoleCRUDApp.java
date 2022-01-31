package main.java.com.itbatia.patterns.adapter;

public class ConsoleCRUDApp {
    public void save(){
        System.out.println("Saving Tag, Post and Writer in Json files");
    }
    public void updateObject(){
        System.out.println("Updating Tag, Post and Writer in Json files");
    }
    public void getById (){
        System.out.println("Loading Tag, Post and Writer from Json files");
    }
    public void delete (){
        System.out.println("Deleting Tag, Post and Writer in Json files");
    }
}
