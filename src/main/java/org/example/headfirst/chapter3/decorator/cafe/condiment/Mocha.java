package org.example.headfirst.chapter3.decorator.cafe.condiment;

import org.example.headfirst.chapter3.decorator.cafe.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
