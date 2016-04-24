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
    private ReservationStatus status;

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

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationDate=" + reservationDate +
                ", user=" + user +
                ", books=" + books +
                ", status=" + status +
                '}';
    }
}
