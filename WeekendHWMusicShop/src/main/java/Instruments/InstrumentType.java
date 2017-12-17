package Instruments;

public enum InstrumentType {
    BRASS("brass"),
    STRING("string"),
    WOODWIND("woodwind"),
    PERCUSSION("percussion"),
    KEYBOARD("keyboard");

    private final String name;

    InstrumentType(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
