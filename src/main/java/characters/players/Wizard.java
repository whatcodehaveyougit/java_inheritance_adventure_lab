package characters.players;

import arsenal.Spell;

import java.util.ArrayList;

public class Wizard extends Player{

    private ArrayList<Spell> spells;

    public Wizard(String name, int health){
        super(name, health);
        this.spells = new ArrayList<Spell>();
    }

    public ArrayList<Spell> getSpells() {
        return spells;
    }

    public int getNumberOfSpells() {
        return spells.size();
    }

    public void addSpell(Spell spell){
        spells.add(spell);
    }
}
