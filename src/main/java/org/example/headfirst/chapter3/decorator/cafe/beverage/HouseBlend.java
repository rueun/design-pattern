package org.example.headfirst.chapter3.decorator.cafe.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(final Size size) {
        this.size = size;
        this.description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        if (size == Size.TALL)
            return .79;
        else if (size == Size.GRANDE)
            return .89;
        return .99;
    }
}
