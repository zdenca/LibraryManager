package cz.librarymanager.model;

import cz.librarymanager.model.enums.Sex;

import java.util.Date;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class User {
    private int id;
    private Name name;
    private Date birthDate;
    private Sex sex;
    private Contact contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name=" + name +
                ", birthDate=" + birthDate +
                ", sex=" + sex +
                ", contact=" + contact +
                '}';
    }
}
