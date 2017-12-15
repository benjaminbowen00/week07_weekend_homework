package Instruments;

public class Piano extends Instrument{

    private PianoType pianoType;
    private int numberOfKeys;

    public Piano(double buyPrice, double sellPrice, InstrumentType type, String material, String colour, PianoType pianoType, int numberOfKeys) {
        super(buyPrice, sellPrice, type, material, colour);
        this.pianoType = pianoType;
        this.numberOfKeys = numberOfKeys;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Playing the piano";
    }
}
