package characters.extras;

import arsenal.IAttack;

public abstract class Extra {
    private String name;
    private int health;

    public Extra(String name, int health){
        this.name = name;
        this.health = health;
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
}
