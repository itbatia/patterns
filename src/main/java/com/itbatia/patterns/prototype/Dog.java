package main.java.com.itbatia.patterns.prototype;

public class Dog {
    private String nickname;

    public Dog(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickname='" + nickname + '\'' +
                '}';
    }
}
