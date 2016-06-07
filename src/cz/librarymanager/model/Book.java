package cz.librarymanager.model;

import cz.librarymanager.model.enums.BookStatus;
import cz.librarymanager.model.enums.LendingType;

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
    private LendingType lendingType;
    private int price;
    private String currency;


    public LendingType isLendingType() {
        return lendingType;
    }

    public void setLendingType(LendingType lendingType) {
        this.lendingType = lendingType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void setStatus(BookStatus status) {
        this.status = status;
    }

    public PublisherData getPublisherData() {
        return publisherData;
    }

    public void setPublisherData(PublisherData publisherData) {
        this.publisherData = publisherData;
    }

    @Override
    public String toString() {
        return "Book{" +
                "registrationNumber ='" + registrationNumber + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title=" + title +
                ", authors=" + authors +
                ", status=" + status +
                ", \npublisherData=" + publisherData +
                ", lendingType=" + lendingType +
                ", price=" + price +
                '}';
    }


}
