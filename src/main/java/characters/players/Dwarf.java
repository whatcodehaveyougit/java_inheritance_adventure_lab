package characters.players;

import arsenal.IAttack;
import arsenal.Weapon;

import java.util.ArrayList;

public class Dwarf extends Player implements IAttack {

    private ArrayList<Weapon> weapons;

    public Dwarf(String name, int health, ArrayList<Weapon> weapons){
        super(name, health);
        this.weapons = weapons;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public int getNumberOfWeapons() {
        return weapons.size();
    }

    public void attack(IAttack enemy){
        int reducedHealth = enemy.getHealth() - this.weapons.get(0).getDamage();
        enemy.setHealth(reducedHealth);
        this.checkIfDead(enemy);
//        if(reducedHealth < 0){
////            this.getTreasureFromDeadEnemy();
//            this.getTreasureFromEnemy();
//        }
    }

    public void checkIfDead(IAttack playerOrEnemy){

    }

    public void getTreasureFromDeadEnemy(){

    };

}
