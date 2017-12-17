import Instruments.Clarinet;
import Instruments.InstrumentType;
import NonInstruments.ClarinetReed;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;
    ClarinetReed reed;

    @Before
    public void before(){
        reed = new ClarinetReed(2, "Soft");
        clarinet = new Clarinet(300, 500, InstrumentType.WOODWIND, "Hardwood", "black", reed, 30 );
    }


    @Test
    public void canPlayClarinet(){
        assertEquals("Toot - playing the clarinet", clarinet.play());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(200, clarinet.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Hardwood", clarinet.getMaterial());
    }

    @Test
    public void canGetReedType(){
        assertEquals("Soft", clarinet.getReedType());
    }

    @Test
    public void canGetInstrumentTypeName(){
        assertEquals("woodwind", clarinet.getInstrumentTypeName());
    }
}
