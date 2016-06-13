package cz.librarymanager.model;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class Contact {
    private Address address;
    private Address contactAddress;
    private int phoneNumber;
    private String email;

    public Contact(Address address, Address contactAddress, int phoneNumber, String email) {
        this.address = address;
        this.contactAddress = contactAddress;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(Address contactAddress) {
        this.contactAddress = contactAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nContact{" +
                "address=" + address +
                ", contactAddress=" + contactAddress +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}
