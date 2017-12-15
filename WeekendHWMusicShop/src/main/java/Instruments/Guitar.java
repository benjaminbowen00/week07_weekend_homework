package Instruments;

import NonInstruments.GuitarString;

import java.util.ArrayList;

public class Guitar extends Instrument {

    private GuitarType guitarType;
    private int numberOfStrings;
    private ArrayList<GuitarString> guitarStrings;

    public Guitar(double buyPrice, double sellPrice, InstrumentType type, String material, String colour, GuitarType guitarType, int numberOfStrings, ArrayList<GuitarString> guitarStrings) {
        super(buyPrice, sellPrice, type, material, colour);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
        this.guitarStrings = guitarStrings;
    }

    public String play(){
        return "Strumming the guitar";
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public ArrayList<GuitarString> getGuitarStrings() {
        return guitarStrings;
    }

    public int getNumberOfStringsInstalled(){
        return this.guitarStrings.size();
    }

    public String tuneGuitar(){
        for(GuitarString string : guitarStrings) {
            string.tune();
        }
        return "You tuned all the strings";
    }
}
