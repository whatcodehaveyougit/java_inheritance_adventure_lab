package arsenal;

import characters.enemies.Enemy;
import characters.players.Player;

public interface IAttack {
    public int getHealth();
    public void setHealth(int health);
    public void attack(IAttack playerOrEnemy);
}
