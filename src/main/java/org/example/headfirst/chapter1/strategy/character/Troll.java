package org.example.headfirst.chapter1.strategy.character;

import org.example.headfirst.chapter1.strategy.character.behavior.AxeBehavior;

public class Troll extends Character {
    public Troll() {
        weaponBehavior = new AxeBehavior();
    }
}