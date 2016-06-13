package cz.librarymanager.model;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

// TODO lastName is mandatory

    public Name(String lastName, String middleName, String firstName) {
        this.lastName = lastName;
        this.middleName = middleName;
        this.firstName = firstName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' + '\n' +
                '}';
    }
}