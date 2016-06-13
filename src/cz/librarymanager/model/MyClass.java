package cz.librarymanager.model;

import cz.librarymanager.model.enums.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Zdenca on 6/7/2016.
 */
public class MyClass {
    public static void main(String[] args) {
//  Books
        Book book1 = new Book();
        book1.setTitle(new Title("Citadela"));
        book1.setRegistrationNumber("100-filozofie");
        book1.setIsbn("978-80-7021-936-2");
        book1.setLendingType(LendingType.ABSENCE);
        book1.setStatus(BookStatus.AVAILABLE);
        book1.setPublisherData(new PublisherData("Vyšehrad", "Praha 3", 3, getDate(2008)));
        book1.setPrice(368);
        book1.setCurrency("Kč");
        book1.setForm(BookForm.PAPERBACK);
        book1.setReservationStatus(ReservationStatus.VALID);

        List<Author> authors = new ArrayList<Author>();
        Author a1 = new Author(new Name("Saint-Exupéry", "de","Antoine") );
        authors.add(a1);
        book1.setAuthors(authors);
//        book1.getAuthors().addAll(authors);


        System.out.println(book1);
        System.out.println();

//  Users: user and librarian
//        user
        User user1 = new User();
        user1.setName(new Name("Klimešová", "", " Zdeňka"));
        user1.setBirthDate(getYMDDate(1990, 2, 20));
        user1.setContact(new Contact(new Address("Praha", "Ledvinova", 1713, 14900),
                new Address("Praha", "Křejspkého", 1525, 14900), 775085376, "zdenka.klimes@gmail.com"));
        user1.setId(130);
        user1.setSex(Sex.FEMALE);

//        librarian
        User librarian = new User();
        librarian.setName(new Name("Polička", null, "Jaroslav"));
        librarian.setId(1);
        librarian.setContact(new Contact(null, null, 271325140, "policka@library.com"));

        System.out.println(librarian);
        System.out.println();

        System.out.println(user1);
        System.out.println();

//  Library
        Library library1 = new Library();
        List<Reservation> reservations = new ArrayList<Reservation>();
        Reservation r1 = new Reservation(getYMDDate(2016,5,13),user1,book1, ReservationStatus.VALID);
        reservations.add(r1);
        library1.setReservations(reservations);
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
//
        System.out.println(r1);
        System.out.println();


//  Reservation

//        r1.setReservationDate(getYMDDate(2016, 5, 11));
//        r1.setBooks(book1);
//        r1.setUser(user1);
//        r1.setReservation(ReservationStatus.VALID);





//  LendingRecord


    }


    private static Date getDate(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, 1, 0);
        return calendar.getTime();
    }

    private static Date getYMDDate(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar.getTime();
    }


}
