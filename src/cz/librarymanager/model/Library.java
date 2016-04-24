package cz.librarymanager.model;

import java.util.List;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class Library {
    private List<Reservation> reservations;
    private List<LendingRecord> lendingRecords;
    private List<Book> books;
    private List<User> users;
    private List<User> librarians;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<User> getLibrarians() {
        return librarians;
    }

    public void setLibrarians(List<User> librarians) {
        this.librarians = librarians;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public List<LendingRecord> getLendingRecords() {
        return lendingRecords;
    }

    public void setLendingRecords(List<LendingRecord> lendingRecords) {
        this.lendingRecords = lendingRecords;
    }

    @Override
    public String toString() {
        return "Library{" +
                "reservations=" + reservations +
                ", lendingRecords=" + lendingRecords +
                ", books=" + books +
                ", users=" + users +
                ", librarians=" + librarians +
                '}';
    }
}
