package cz.librarymanager.model.enums;

/**
 * Created by Zdenca on 4/24/2016.
 */
public enum ReservationStatus {
    STORNO(0), VALID(1), EXPIRED(2);
    private final int code;

    private ReservationStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public ReservationStatus fromCode(int code) {
        for (ReservationStatus status : values()) {
            if (status.code == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid code " + code);
    }
}
