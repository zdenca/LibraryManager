package cz.librarymanager.model;

import cz.librarymanager.model.enums.BookStatus;
import cz.librarymanager.model.enums.LendingType;

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
        Book book1 = new Book();
        book1.setTitle(new Title("Citadela"));
        book1.setRegistrationNumber("100-filozofie");
        book1.setIsbn("978-80-7021-936-2");
        book1.setLendingType(LendingType.ABSENCE);
        book1.setStatus(BookStatus.AVAILABLE);
        book1.setPublisherData(new PublisherData("Vyšehrad", "Praha 3", 3, getDate(2008)));
        book1.setPrice(368);

        List<Author> authors = new ArrayList<Author>();
        Author a1 = new Author();
        a1.setName(new Name("Saint-Exupéry", "de", "Antoine"));
        authors.add(a1);
        book1.setAuthors(authors);
//        book1.getAuthors().addAll(authors);


        System.out.println(book1);
    }

    private static Date getDate(int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,0,1);
        return calendar.getTime();
    }
}
