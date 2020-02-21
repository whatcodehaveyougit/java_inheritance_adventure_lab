package Arenas;

import arsenal.IAttack;
import arsenal.IHeal;
import characters.enemies.Enemy;
import characters.extras.Extra;
import characters.players.Player;

public class Jungle {

    private IAttack player;
    private IAttack enemy;
    private IHeal extra;

    public Jungle(IAttack player, IAttack enemy, IHeal extra){
        this.player = player;
        this.enemy = enemy;
        this.extra = extra;
    }

    public IAttack getPlayer() {
        return player;
    }

    public IAttack getEnemy() {
        return enemy;
    }

    public IHeal getExtra() {
        return extra;
    }

}
