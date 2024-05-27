package org.example.headfirst.chapter3.decorator.cafe.beverage;

public class Espresso extends Beverage {

    public Espresso(final Size size) {
        this.size = size;
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        if (size == Size.TALL)
            return 1.89;
        else if (size == Size.GRANDE)
            return 1.99;
        return 1.99;
    }
}
