package cz.librarymanager.model;

import cz.librarymanager.model.enums.BookStatus;

import java.util.List;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class Book {
    private String registrationNumber;
    private String isbn;
    private Title title;
    private List<Author> authors;
    private BookStatus status;
    private PublisherData publisherData;
}
