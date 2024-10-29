package java_enum.enumdef;

public enum MessageStatusEnum {
    ERROR("error"),
    INFO("info"),
    SUCCESS("success"),
    WARNING("warning");

    private String value;

    MessageStatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

}
