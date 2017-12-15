package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(double buyPrice, double sellPrice, InstrumentType type, String material, String colour, int numberOfValves) {
        super(buyPrice, sellPrice, type, material, colour);
        this.numberOfValves = numberOfValves;
    }

    public String play(){
        return "Toot - trumpet is playing";
    }
}
