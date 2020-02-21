import characters.players.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Merlin", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("Merlin", wizard.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void weaponsStartsAtZero(){
        assertEquals(0, wizard.getNumberOfSpells());
    }

}
