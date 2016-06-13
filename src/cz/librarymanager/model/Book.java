package cz.librarymanager.model;

import cz.librarymanager.model.enums.BookForm;
import cz.librarymanager.model.enums.BookStatus;
import cz.librarymanager.model.enums.LendingType;
import cz.librarymanager.model.enums.ReservationStatus;

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
    private BookForm form;
    private ReservationStatus reservationStatus;



   public ReservationStatus getReservationStatus() {
       return reservationStatus;
   }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    public BookForm getForm() {
        return form;
    }

    public void setForm(BookForm form) {
        this.form = form;
    }

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
                "registrationNumber='" + registrationNumber + '\'' +
                ", isbn='" + isbn + '\'' +
                ",\ntitle=" + title +
                ", authors=" + authors +
                ",\npublisherData=" + publisherData +
                ",\nstatus=" + status +
                ", lendingType=" + lendingType +
                ", reservationStatus= " + reservationStatus +
                ", form=" + form +
                ", price=" + price +
                ", currency='" + currency + '\'' +
                '}';
    }


}
