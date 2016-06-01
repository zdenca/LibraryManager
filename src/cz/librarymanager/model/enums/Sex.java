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

    public static Sex fromCode(int code) {
        for (Sex sex : values()) {
            if (sex.code == code) {
                return sex;
            }
        }
        throw new IllegalArgumentException("Invalid code " + code);
    }
}
