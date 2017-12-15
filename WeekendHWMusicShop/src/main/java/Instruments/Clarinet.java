package Instruments;

import NonInstruments.ClarinetReed;

public class Clarinet extends Instrument{

    private ClarinetReed reed;
    private int size;

    public Clarinet(InstrumentType type, String material, String colour, ClarinetReed reed, int size) {
        super(type, material, colour);
        this.reed = reed;
        this.size = size;
    }
}
