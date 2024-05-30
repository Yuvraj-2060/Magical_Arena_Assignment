package com.magicalarena.arena;

import com.magicalarena.game.Battle;
import com.magicalarena.game.Player;

public class Arena {
    Player playerA;
    Player playerB;

    public Arena(Player playerA, Player playerB) {

        this.playerA = playerA;
        this.playerB = playerB;
    }

    public void startBattle() {
        Battle battle = new Battle(playerA, playerB);
        battle.fight();
    }
}