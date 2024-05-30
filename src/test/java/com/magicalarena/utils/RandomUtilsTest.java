package com.magicalarena.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomUtilsTest {
    @Test

    public void testRandomInt() {
        for (int i = 0; i < 100; i++) {
            int random = RandomUtils.randomInt(1, 6);
            assertTrue(random >= 1 && random <= 6);
        }
    }
}
