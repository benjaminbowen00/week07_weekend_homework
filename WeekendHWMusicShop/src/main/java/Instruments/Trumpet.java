package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(InstrumentType type, String material, String colour, int numberOfValves) {
        super(type, material, colour);
        this.numberOfValves = numberOfValves;
    }
}
