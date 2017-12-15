package NonInstruments;

public abstract class Product implements ISell{
    private double buyPrice;
    private double sellPrice;

    public Product(double buyPrice, double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
