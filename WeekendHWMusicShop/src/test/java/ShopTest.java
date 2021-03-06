import Instruments.*;
import NonInstruments.ClarinetReed;
import NonInstruments.GuitarString;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Clarinet clarinet;
    ClarinetReed reed;
    GuitarString guitarString;
    ArrayList<GuitarString> strings;
    Guitar guitar;
    Shop shop;
    Shop shop2;

    @Before
    public void before(){
        reed = new ClarinetReed(2, "Soft");
        clarinet = new Clarinet(300, 500, InstrumentType.WOODWIND, "Hardwood", "black", reed, 30 );
        guitarString = new GuitarString("Fender", "nickel");
        strings = new ArrayList<>();
        int i = 0;
        while (i<6){strings.add(guitarString); i++;}
        guitar = new Guitar(300, 400, InstrumentType.STRING,"Rosewood", "Yellow", GuitarType.ACOUSTIC, 6, strings );
        shop = new Shop("Ray's Music Exchange");
        shop.addProductToStock(guitar);
        shop.addProductToStock(clarinet);
        shop2 = new Shop("Empty Music Shop");

    }

    @Test
    public void canCountStock(){
        assertEquals(2, shop.allStockCount());
    }

    @Test
    public void canGetStockBuyValue(){
        assertEquals(600, shop.totalStockBuyValue(), 0.01);
        shop.removeProductFromStock(guitar);
        assertEquals(300, shop.totalStockBuyValue(), 0.01);
    }

    @Test
    public void canGetStockSellValue(){
        assertEquals(900, shop.totalStockSellValue(), 0.01);
    }

    @Test
    public void canGetTotalProfit(){
        assertEquals(300, shop.totalProfitOfStock(), 0.01);
    }

    @Test
    public void containsInstrumentTrue(){
        assertEquals(true, shop.containsInstruments());
    }

    @Test
    public void containsInstrumentFalse(){
        assertEquals(false, shop2.containsInstruments());
    }

    @Test
    public void canPlayAllInstruments(){
        assertEquals("Strumming the guitar, Toot - playing the clarinet", shop.playAllInstruments());
    }

    @Test
    public void cantPlayInstrumentsIfNone(){
        assertEquals("Silence", shop2.playAllInstruments());
    }


    @Test
    public void doesHaveStringInstrument(){
        assertEquals(true, shop.hasTypeOfInstrument("string"));
    }
    @Test
    public void doesntHaveKeyboardInstrument(){
        assertEquals(false, shop.hasTypeOfInstrument("keyboard"));
    }

    @Test
    public void doesHaveGuitar(){
        assertEquals(true, shop.hasSpecificTypeOfInstrument("Guitar"));
    }

    @Test
    public void doesntHaveTrumpet(){
        assertEquals(false, shop.hasSpecificTypeOfInstrument("Trumpet"));
    }

    @Test
    public void canGetAllGuitars(){
        assertEquals(1, shop.getAllOFSpecificInstrument("guitar").size());
        shop.addProductToStock(guitar);
        assertEquals(2, shop.getAllOFSpecificInstrument("guitar").size());
    }

    @Test
    public void cantGetTrumpetsIfNone(){
        assertEquals(0, shop.getAllOFSpecificInstrument("trumpet").size());
    }

    @Test
    public void canGetNumberofGuitarsInStock(){
        assertEquals(1, shop.getNumberOfInstrumentsInStock("Guitar"));
    }

    //Testing class methods
    @Test
    public void canUseFunction(){
        assertEquals("hel", Main.removeLastTwoCharacters("hello"));
    }

}
