import characters.players.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Camelot", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Camelot", knight.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, knight.getHealth());
    }

    @Test
    public void weaponsStartsAtZero(){
        assertEquals(0, knight.getNumberOfWeapons());
    }

}
