package main.java.com.itbatia.patterns.prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Human human = new Human("Oleg", "Ivanov", 35, new Dog("Sharik"),
                new Address("Minsk", "Kirova", 55, 101));

        HumanFactory factory = new HumanFactory(human);
        System.out.println(human);
        System.out.println(factory.cloneHuman());
    }
}
