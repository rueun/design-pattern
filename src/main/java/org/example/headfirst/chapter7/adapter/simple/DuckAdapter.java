package org.example.headfirst.chapter7.adapter.simple;

import java.util.Random;

public class DuckAdapter implements Turkey {
    private final Duck duck;
    private final Random random;

    public DuckAdapter(final Duck duck) {
        this.duck = duck;
        this.random = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        // duck can fly longer distances
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
