package Enums;

public enum Material {
    PLASTIC(1),
    RUBBER(2),
    IRON(3);
    private final int value;

    Material(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
