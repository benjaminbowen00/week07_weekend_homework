package Instruments;

public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int numberOfStrings;

    public Guitar(InstrumentType type, String material, String colour, GuitarType guitarType, int numberOfStrings) {
        super(type, material, colour);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }
}
