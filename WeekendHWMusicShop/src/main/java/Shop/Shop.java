package Shop;

import Instruments.Instrument;
import Instruments.InstrumentType;
import NonInstruments.Product;

import java.util.ArrayList;

public class Shop {
    String name;
    ArrayList<Product> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public void addProductToStock(Product product){
        this.stock.add(product);
    }

    public void removeProductFromStock(Product product){
        this.stock.remove(product);
    }

    public double totalStockBuyValue(){
        double total = 0;
        for(Product product : stock){
            total += product.getBuyPrice();
        }
        return total;
    }

    public double totalStockSellValue(){
        double total = 0;
        for(Product product : stock){
            total += product.getSellPrice();
        }
        return total;
    }

    public double totalProfitOfStock(){
        double total = 0;
        for(Product product : stock){
            total += product.calculateMarkup();
        }
        return total;
    }

    public boolean containsInstruments(){
        for (Product product : stock){
            if(product instanceof Instrument){return true;}
        }
        return false;
    }

//    public boolean containsInstrumentType(String InstrumentType){
//        ArrayList<Instruments.InstrumentType> instrumentTypes;
//
//        for(Product product : stock)
//            if(product )
//    }

    public String playAllInstruments(){
        if(containsInstruments()) {
            String sounds = "";
            for (Product product : stock) {
                if (product instanceof Instrument) {
                    sounds += ((Instrument) product).play() + ", ";
                }
            }
            return sounds.substring(0, sounds.length() - 2);
        }
        return "Silence";
    }

//    public String getByInstrumentType(String instrumentType){
//
//
//    }




}
