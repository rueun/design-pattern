package org.example.headfirst.chapter1.strategy.character;

import org.example.headfirst.chapter1.strategy.character.behavior.SwordBehavior;

public class Knight extends Character {
    public Knight() {
        weaponBehavior = new SwordBehavior();
    }
}