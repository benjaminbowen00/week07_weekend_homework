package Shop;

import Instruments.Instrument;
import Instruments.InstrumentType;
import NonInstruments.Product;

import java.util.ArrayList;

import static Instruments.Main.removeLastTwoCharacters;

public class Shop {
    private String name;
    private ArrayList<Product> stock;

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

    public int allStockCount(){
        return this.stock.size();
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

    // this isn't a shop method but no better place for it - a main method?
    //Still Ok to have it without any precursor?
//    public static String removeLastTwoCharacters(String input){
//        return input.substring(0, input.length()-2);
//    }

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
            return removeLastTwoCharacters(concatenateAllSounds());
        }
        return "Silence";
    }

    public boolean hasTypeOfInstrument(String instrumentType){
        for (Product product : stock){
            if(((Instrument) product).getType().getName().equals(instrumentType)){
                return true;
            }
        }
        return false;
    }

    //no functions in java? Only methods or class methods - use 'static' for class method
    // Either use these as Shop.methodname() or have them run inside another shop method?
    //This seems like it should be a product method?
    //Use:
//    public static String getProductClassAsLowerCase(){
//        return this.getClass().getSimpleName().toLowerCase();
//    }

    //instead of original method:
//    public static String getProductClassAsLowerCase(Product product){
//        return product.getClass().getSimpleName().toLowerCase();
//    }

    public boolean hasSpecificTypeOfInstrument(String instrument){
        for (Product product : stock){
            if (product.getProductClassAsLowerCase().equals(instrument.toLowerCase())){return true;}
        }
        return false;
    }

    public ArrayList<Product> getAllOFSpecificInstrument(String instrument){
        ArrayList<Product> instrumentsArrayList = new ArrayList<>();
        for (Product product : stock){
            if (product.getProductClassAsLowerCase().equals(instrument.toLowerCase())){
                instrumentsArrayList.add(product);}
        }
        return instrumentsArrayList;
    }

    public int getNumberOfInstrumentsInStock(String instrument){
        return getAllOFSpecificInstrument(instrument).size();
    }


}
