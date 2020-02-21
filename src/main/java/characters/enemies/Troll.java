package characters.enemies;

import arsenal.IAttack;
import arsenal.Weapon;

import java.util.ArrayList;

public class Troll extends Enemy implements IAttack {

    private int treasure;
    private Weapon club;

    public Troll(String name, int health, int treasure, Weapon club){
        super(name, health, treasure);
        this.club = club;

    }

    public void attack(IAttack player){
        int reducedHealth = player.getHealth() - this.club.getDamage();
        player.setHealth(reducedHealth);
    }

}
