import NonInstruments.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString("Fender", "nickel");
    }

    @Test
    public void canGetGuitarStringName(){
        assertEquals("Fender", guitarString.getName());
    }

    @Test
    public void canTuneGuitarString(){
        assertEquals("You just tuned the string", guitarString.tune());
    }


}
