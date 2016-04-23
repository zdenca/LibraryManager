package cz.librarymanager.model;

import cz.librarymanager.model.enums.Sex;

import java.util.Date;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class User {
    private int id;
    private String name;
    private String surname;
    private Date birthDate;
    private Sex sex;
    private Contact contact;

}
