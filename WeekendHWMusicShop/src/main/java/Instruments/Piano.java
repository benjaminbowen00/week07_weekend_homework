package Instruments;

public class Piano extends Instrument{

    private PianoType pianoType;
    private int numberOfKeys;

    public Piano(InstrumentType type, String material, String colour, PianoType pianoType, int numberOfKeys) {
        super(type, material, colour);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
