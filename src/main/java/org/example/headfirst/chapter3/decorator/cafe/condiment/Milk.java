package org.example.headfirst.chapter3.decorator.cafe.condiment;

import org.example.headfirst.chapter3.decorator.cafe.beverage.Beverage;
import org.example.headfirst.chapter3.decorator.cafe.beverage.Size;

public class Milk extends CondimentDecorator {

    public Milk(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getSize() == Size.TALL)
            return beverage.cost() + .05;
        else if (beverage.getSize() == Size.GRANDE)
            return beverage.cost() + .10;
        return beverage.cost() + .15;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }
}
