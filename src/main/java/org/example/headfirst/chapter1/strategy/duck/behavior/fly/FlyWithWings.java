package org.example.headfirst.chapter1.strategy.duck.behavior.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!! with wings");
    }
}
