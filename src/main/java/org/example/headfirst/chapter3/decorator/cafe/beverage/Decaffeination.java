package org.example.headfirst.chapter3.decorator.cafe.beverage;

public class Decaffeination extends Beverage {

    public Decaffeination() {
        description = "Decaffeination Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
