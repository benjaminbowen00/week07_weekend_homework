package Instruments;
import NonInstruments.Product;

public abstract class Instrument extends Product implements IPlay{

    private InstrumentType type;
    private String material;
    private String colour;

    public Instrument(double buyPrice, double sellPrice, InstrumentType type, String material, String colour) {
        super(buyPrice, sellPrice);
        this.type = type;
        this.material = material;
        this.colour = colour;
    }

    public InstrumentType getType() { return type; }

    public String getInstrumentTypeName(){ return this.type.getName();}

    public String getMaterial() { return material; }

    public String getColour() { return colour; }
}
