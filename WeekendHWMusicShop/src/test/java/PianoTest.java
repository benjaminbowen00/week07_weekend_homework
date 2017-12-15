import Instruments.InstrumentType;
import Instruments.Piano;
import Instruments.PianoType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano(500, 1200, InstrumentType.KEYBOARD, "Spruce", "Black", PianoType.BABYGRAND,88 );
    }

    @Test
    public void canGetPianoType(){
        assertEquals(PianoType.BABYGRAND, piano.getPianoType());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Spruce", piano.getMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("Playing the piano", piano.play());
    }


    @Test
    public void canCalculateMarkup(){
        assertEquals(700, piano.calculateMarkup(), 0.01);
    }
}
