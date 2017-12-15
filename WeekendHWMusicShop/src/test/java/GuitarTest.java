import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import NonInstruments.GuitarString;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    GuitarString guitarString;
    ArrayList<GuitarString> strings;
    Guitar guitar;

    @Before
    public void before(){
        guitarString = new GuitarString("Fender", "nickel");
        strings = new ArrayList<>();
        int i = 0;
        while (i<6){strings.add(guitarString); i++;}
        guitar = new Guitar(600, 400, InstrumentType.STRING,"Rosewood", "Yellow", GuitarType.ACOUSTIC, 6, strings );
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStringsInstalled());
    }

    @Test
    public void canTuneAllStrings(){
        assertEquals("You tuned all the strings", guitar.tuneGuitar());
    }

}
