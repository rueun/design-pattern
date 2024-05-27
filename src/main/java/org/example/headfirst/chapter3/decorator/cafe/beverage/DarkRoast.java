package org.example.headfirst.chapter3.decorator.cafe.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(Size size) {
        this.size = size;
        this.description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return .89;
        } else if (size == Size.GRANDE) {
            return .99;
        }
        return 1.09;
    }
}
