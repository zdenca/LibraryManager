package cz.librarymanager.model;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class Address {
    private String city;
    private String street;
    private int number;
    private int zipCode;

    public Address(String city, String street, int number, int zipCode) {
        this.city = city;
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {

        return city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {

        return street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", zipCode=" + zipCode + '\n' +
                '}';
    }
}
