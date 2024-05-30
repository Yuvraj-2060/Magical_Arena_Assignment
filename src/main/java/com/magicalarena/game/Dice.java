package com.magicalarena.game;

import com.magicalarena.utils.RandomUtils;

public class Dice {
    private int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return RandomUtils.randomInt(1, sides);
    }
}
