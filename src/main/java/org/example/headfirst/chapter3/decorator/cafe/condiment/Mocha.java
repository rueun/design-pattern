package org.example.headfirst.chapter3.decorator.cafe.condiment;

import org.example.headfirst.chapter3.decorator.cafe.beverage.Beverage;
import org.example.headfirst.chapter3.decorator.cafe.beverage.Size;

public class Mocha extends CondimentDecorator {

    public Mocha(final Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        if (beverage.getSize() == Size.TALL)
            return beverage.cost() + .15;
        else if (beverage.getSize() == Size.GRANDE)
            return beverage.cost() + .20;
        return beverage.cost() + .25;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
