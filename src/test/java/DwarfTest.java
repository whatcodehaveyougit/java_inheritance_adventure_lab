import arsenal.Weapon;
import characters.enemies.Enemy;
import characters.enemies.Troll;
import characters.players.Dwarf;
import characters.players.Knight;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Weapon sword1;
    Weapon sword2;
    Dwarf dwarf;
    Enemy enemy;

    @Before
    public void before(){
        sword1 = new Weapon("sword", 25);
        sword2 = new Weapon("sword", 25);
        ArrayList<Weapon> weapons = new ArrayList<Weapon>();
        weapons.add(sword1);
        weapons.add(sword2);
        dwarf = new Dwarf("Jenkins", 100, weapons);
        enemy = new Troll("Bob", 100, 50, sword1);
    }

    @Test
    public void canGetName(){
        assertEquals("Jenkins", dwarf.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void canGetNumberOfWeapons(){
        assertEquals(2, dwarf.getNumberOfWeapons());
    }

    @Test
    public void canGetTreasureFromEnemy(){
        dwarf.getTreasureFromEnemy(enemy);
        assertEquals(50, dwarf.getTreasure());
        assertEquals(0, enemy.getTreasure());
    }
}
