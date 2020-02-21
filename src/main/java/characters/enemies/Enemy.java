package characters.enemies;

import arsenal.IAttack;

public abstract class Enemy{

    private String name;
    private int health;
    private int treasure;

    public Enemy(String name, int health, int treasure) {
        this.name = name;
        this.health = health;
        this.treasure = treasure;
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

    public int getTreasure() {
        return this.treasure;
    }

    public void setTreasureToZero() {
        this.treasure = 0;
    }
}
