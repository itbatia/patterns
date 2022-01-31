package main.java.com.itbatia.patterns.prototype;

public class Address {
    private String sity;
    private String street;
    private int houseNumber;
    private int apartmentNumber;

    public Address(String sity, String street, int houseNumber, int apartmentNumber) {
        this.sity = sity;
        this.street = street;
        this.houseNumber = houseNumber;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "sity='" + sity + '\'' +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                ", apartmentNumber=" + apartmentNumber +
                '}';
    }
}