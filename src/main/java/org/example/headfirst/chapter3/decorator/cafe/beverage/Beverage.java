package org.example.headfirst.chapter3.decorator.cafe.beverage;

public abstract class Beverage {
    String description = "Unknown Beverage";
    Size size = Size.TALL;
    public String getDescription() {
        return description;
    }

    public Size getSize() {
        return size;
    }
    public abstract double cost();
}
