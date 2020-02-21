package characters.players;

import arsenal.IAttack;
import characters.enemies.Enemy;

public abstract class Player{

    private String name;
    private int health;
    private int treasure;

    public Player(String name, int health){
        this.name = name;
        this.health = health;
        this.treasure = 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getTreasure(){
        return this.treasure;
    }

    public void getTreasureFromEnemy(Enemy enemy){
        int treasure = enemy.getTreasure();
        enemy.setTreasureToZero();
        this.treasure += treasure;
    }

    protected abstract void getTreasureFromDeadEnemy();
}
