package cz.librarymanager.model;

import java.util.Date;

/**
 * Created by Zdenca on 4/23/2016.
 */
public class LendingRecord {
    private Date borrowDate;
    private Date returningDate;
    private User user;
    private User librarian;




    public User getLibrarian() {
        return librarian;
    }

    public void setLibrarian(User librarian) {
        this.librarian = librarian;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturningDate() {
        return returningDate;
    }

    public void setReturningDate(Date returningDate) {
        this.returningDate = returningDate;
    }


}
