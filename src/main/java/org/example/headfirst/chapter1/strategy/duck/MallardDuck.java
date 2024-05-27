package org.example.headfirst.chapter1.strategy.duck;

import org.example.headfirst.chapter1.strategy.duck.behavior.fly.FlyWithWings;
import org.example.headfirst.chapter1.strategy.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a real");
    }
}
