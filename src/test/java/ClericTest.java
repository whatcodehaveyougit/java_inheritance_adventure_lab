import characters.extras.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void before(){

        cleric = new Cleric("Jenkins", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Jenkins", cleric.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, cleric.getHealth());
    }

    @Test
    public void remediesStartsAtZero(){
        assertEquals(0, cleric.getNumberOfRemedies());
    }
}
