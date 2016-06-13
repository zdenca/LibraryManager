package cz.librarymanager.model;

import cz.librarymanager.model.enums.ReservationStatus;

import java.util.Date;

/**
 * Created by Zdenca on 4/23/2016.
 */
public class Reservation {
    private Date reservationDate;
    private User user;
    private Book books;
    private ReservationStatus reservationStatus;


    public Reservation(Date reservationDate, User user, Book books, ReservationStatus reservationStatus) {
        this.reservationDate = reservationDate;
        this.user = user;
        this.books = books;
        this.reservationStatus = reservationStatus;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Book getBooks() {
        return books;
    }

    public void setBooks(Book books) {
        this.books = books;
    }

    public ReservationStatus getReservation() {
        return reservationStatus;
    }

    public void setReservation(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationDate=" + reservationDate +
                ",\nuser=" + user +
                ",\nbooks=" + books +
                '}';
    }
}
