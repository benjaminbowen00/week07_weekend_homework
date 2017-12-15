package NonInstruments;

public class GuitarString {
    String name;
    String material;

    public GuitarString(String name,  String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String tune() {
        return "You just tuned the string";
    }
}
