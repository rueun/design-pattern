package org.example.headfirst.chapter3.decorator.cafe.condiment;

import org.example.headfirst.chapter3.decorator.cafe.beverage.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
