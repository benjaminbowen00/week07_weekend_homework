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
//        for (InstrumentType type : InstrumentType.va){
//
//        }
//        String list = "";
//        list +=

//        for(Product product : stock)
//            if(product )
//    }

    public String removeLastTwoCharacters(String input){
        return input.substring(0, input.length()-2);
    }

    public String concatenateAllSounds(){
        String sounds = "";
        for (Product product : stock) {
            if (product instanceof Instrument) {
                sounds += ((Instrument) product).play() + ", ";
            }
        }
        return sounds;
    }

    public String playAllInstruments(){
        if(containsInstruments()) {
            String sounds = concatenateAllSounds();
            return removeLastTwoCharacters(sounds);
        }
        return "Silence";
    }

//    public boolean getByInstrumentType(String instrumentType){
//        for(InstrumentType type : InstrumentType.values()){
//            for(Product product : stock) {
//                product = (Instrument) product;
//                if (((Instrument) product).getType().getName() == type.getName()) {
//                    return true;
//                }
//            }
//        }
//        return false;
//
//    }
    //loops through all enum values

    public boolean hasTypeOfInstrument(String instrumentType){
        for (Product product : stock){
            if(((Instrument) product).getType().getName() == instrumentType){
                return true;
            }
        }
        return false;
    }

    public boolean hasSpecificTypeOfInstrument(String instrument){
        for (Product product : stock){
            String testing = product.getClass().getSimpleName().toLowerCase();
            if (product.getClass().getSimpleName().toLowerCase().equals(instrument.toLowerCase())){return true;}
        }
        return false;
    }


}
