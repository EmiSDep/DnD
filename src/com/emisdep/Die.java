package com.emisdep;

import java.util.Random;

public class Die {

    private int value;
    private int sides;

    public Die() {
        value = 6;
    }

    public Die(int sides, int value) {
        this.sides = sides;
        this.value = value;
    }

    public void roll(Random rand) {
        value = rand.nextInt(sides) + 1;
    }

    public int getValue(){
        return value;
    }
}



