package characters.players;

import arsenal.Weapon;

import java.util.ArrayList;

public class Knight extends Player {

    private ArrayList<Weapon> weapons;

    public Knight(String name, int health){
        super(name, health);
        this.weapons = new ArrayList<Weapon>();
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public int getNumberOfWeapons() {
        return weapons.size();
    }

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }
}
