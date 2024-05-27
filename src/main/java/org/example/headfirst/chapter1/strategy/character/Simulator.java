package org.example.headfirst.chapter1.strategy.character;

import org.example.headfirst.chapter1.strategy.character.behavior.AxeBehavior;

public class Simulator {
    public static void main(String[] args) {
        Character queen = new Queen();
        Character troll = new Troll();
        Character knight = new Knight();

        queen.fight();
        troll.fight();
        knight.fight();

        System.out.println("Queen changes weapon to Axe");
        queen.setWeaponBehavior(new AxeBehavior());
        queen.fight();
    }
}