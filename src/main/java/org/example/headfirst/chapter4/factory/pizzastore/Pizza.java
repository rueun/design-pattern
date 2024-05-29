package org.example.headfirst.chapter4.factory.pizzastore;

public abstract class Pizza {
    public void prepare() {
        System.out.println("Preparing " + this.getClass().getSimpleName());
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
}
