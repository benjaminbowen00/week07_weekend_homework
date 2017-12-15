import Instruments.Clarinet;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
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
    public void canGetStockBuyValue(){
        assertEquals(600, shop.totalStockBuyValue(), 0.01);
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



}
