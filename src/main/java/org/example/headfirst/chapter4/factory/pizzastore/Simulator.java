package org.example.headfirst.chapter4.factory.pizzastore;

public class Simulator {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza("cheese");
    }
}
