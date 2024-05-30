package com.magicalarena.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    public void testPlayerCreation() {
        Player player = new Player("Test", 50, 5, 10);
        assertEquals("Test", player.getName());
        assertEquals(50, player.getHealth());
        assertEquals(5, player.getStrength());
        assertEquals(10, player.getAttack());
    }

    @Test
    public void testTakeDamage() {
        Player player = new Player("Test", 50, 5, 10);
        player.takeDamage(20);
        assertEquals(30, player.getHealth());

        player.takeDamage(40);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("Test", 50, 5, 10);
        assertTrue(player.isAlive());

        player.takeDamage(50);
        assertFalse(player.isAlive());
    }
}
