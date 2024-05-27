package org.example.headfirst.chapter3.decorator.cafe.beverage;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
