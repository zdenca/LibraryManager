package cz.librarymanager.model.enums;

/**
 * Created by Zdenca on 4/24/2016.
 */
public enum LendingType {
    PRESENCE(0), ABSENCE(1);
    private final int code;

    private LendingType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static LendingType fromCode(int code) {
        for (LendingType type : values()) {
            if (type.code == code) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid code " + code);
    }
}
