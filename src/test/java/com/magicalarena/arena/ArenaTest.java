package com.magicalarena.arena;

import com.magicalarena.game.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArenaTest {
    @Test
    public void testArenaCreation() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);

        assertEquals(playerA, arena.playerA);
        assertEquals(playerB, arena.playerB);
    }
}
