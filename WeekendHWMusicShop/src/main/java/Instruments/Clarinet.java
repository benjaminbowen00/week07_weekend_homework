package Instruments;

import NonInstruments.ClarinetReed;

public class Clarinet extends Instrument{

    private ClarinetReed reed;
    private int size;

    public Clarinet(double buyPrice, double sellPrice, InstrumentType type, String material, String colour, ClarinetReed reed, int size) {
        super(buyPrice, sellPrice, type, material, colour);
        this.reed = reed;
        this.size = size;
    }

    public String play(){
        return "Toot - playing the clarinet";
    }

    public ClarinetReed getReed() {
        return reed;
    }

    public int getSize() {
        return size;
    }
}
