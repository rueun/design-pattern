package org.example.headfirst.chapter1.strategy.character.behavior;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("I'm using a Sword");
    }
}
