package org.example.headfirst.chapter3.decorator.cafe.beverage;

public class Decaffeination extends Beverage {

    public Decaffeination(final Size size) {
        this.size = size;
        this.description = "Decaffeination Coffee";
    }

    @Override
    public double cost() {
        if (size == Size.TALL) {
            return 1.05;
        } else if (size == Size.GRANDE) {
            return 1.15;
        }
        return 1.25;
    }
}
