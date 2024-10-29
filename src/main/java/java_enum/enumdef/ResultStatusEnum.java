package java_enum.enumdef;

public enum ResultStatusEnum {
    SUCCESS(0),
    ERROR(3);

    private int value;

    ResultStatusEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
