package main.java.com.itbatia.patterns.prototype;

public class Human implements Copyable {
    private String name;
    private String surname;
    private int age;
    private Dog dog;
    private Address address;

    public Human(String name, String surname, int age, Dog dog, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.dog = dog;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object copy() {
        return new Human(name, surname, age, dog, address);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                ", address=" + address +
                '}';
    }
}