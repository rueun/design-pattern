package org.example.headfirst.chapter1.strategy.character;

import org.example.headfirst.chapter1.strategy.character.behavior.KnifeBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();
    }
}