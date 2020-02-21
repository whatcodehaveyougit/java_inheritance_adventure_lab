import arsenal.Weapon;
import characters.enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TrollTest {

    Troll troll;
    Weapon club;

    @Before
    public void before(){
        club = new Weapon("club", 20);
        troll = new Troll("Gurt", 100, 20, club);
    }

    @Test
    public void getName() {
        assertEquals("Gurt", troll.getName());
    }

    @Test
    public void getHealth() {
        assertEquals(100, troll.getHealth());
    }

    @Test
    public void getTreasure(){
        assertEquals(20, troll.getTreasure());
    }
}
