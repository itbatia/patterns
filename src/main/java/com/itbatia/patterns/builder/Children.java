package main.java.com.itbatia.patterns.builder;

public class Children {
    private String name;
    private int age;

    public Children(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nChild{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
