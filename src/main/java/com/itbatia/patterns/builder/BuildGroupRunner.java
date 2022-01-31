package main.java.com.itbatia.patterns.builder;

public class BuildGroupRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new SeniorGroupBuilder());
        Group group = director.buildGroup();

        System.out.println(group);
    }
}
