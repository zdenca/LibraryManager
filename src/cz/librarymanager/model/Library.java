package cz.librarymanager.model;

import java.util.List;

/**
 * Created by Zdenca on 4/18/2016.
 */
public class Library {
    private List<Reservation> reservations;
    private List<LendingRecord> lendingRecords;

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
}
