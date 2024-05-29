package org.example.headfirst.chapter4.factory.pizzastore.store;

import org.example.headfirst.chapter4.factory.pizzastore.pizza.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(final String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            case "clam" -> new NYStyleClamPizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            default -> throw new IllegalArgumentException("Unexpected value: " + type);
        };
    }
}
