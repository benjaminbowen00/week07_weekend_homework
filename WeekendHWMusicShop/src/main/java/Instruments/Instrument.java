package Instruments;

public class Instrument {

    private InstrumentType type;
    private String material;
    private String colour;

    public Instrument(InstrumentType type, String material, String colour) {
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    public InstrumentType getType() { return type; }

    public String getMaterial() { return material; }

    public String getColour() { return colour; }
}
