package org.example.headfirst.chapter1.strategy.duck;

import org.example.headfirst.chapter1.strategy.duck.behavior.fly.FlyNoWay;
import org.example.headfirst.chapter1.strategy.duck.behavior.quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
}
