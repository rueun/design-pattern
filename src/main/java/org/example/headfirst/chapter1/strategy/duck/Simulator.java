package org.example.headfirst.chapter1.strategy.duck;

import org.example.headfirst.chapter1.strategy.duck.behavior.fly.FlyWithWings;
import org.example.headfirst.chapter1.strategy.duck.behavior.quack.Quack;

public class Simulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println("Changing behavior");
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.setQuackBehavior(new Quack());
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}