package cz.librarymanager.model.enums;

/**
 * Created by Zdenca on 4/18/2016.
 */
public enum Sex {
    FEMALE(0), MALE(1);
    private final int code;

    private Sex(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
    public Sex fromCode(int code) {
        if (code == 0) {
            return FEMALE;
        } else if (code == 1) {
            return MALE;
        } else {
            throw new IllegalArgumentException("Invalid code " + code);
        }
    }
}
