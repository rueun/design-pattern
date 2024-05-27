package org.example.headfirst.chapter1.strategy.character;

import org.example.headfirst.chapter1.strategy.character.behavior.BowAndArrowBehavior;

public class Queen extends Character {
    public Queen() {
        weaponBehavior = new BowAndArrowBehavior();
    }
}
