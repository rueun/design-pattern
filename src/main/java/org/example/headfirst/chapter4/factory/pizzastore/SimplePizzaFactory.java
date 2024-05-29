package org.example.headfirst.chapter4.factory.pizzastore;

public class SimplePizzaFactory {

    Pizza createPizza(final String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "veggie" -> new VeggiePizza();
            case "clam" -> new ClamPizza();
            case "pepperoni" -> new PepperoniPizza();
            default -> throw new IllegalArgumentException("Unexpected value: " + type);
        };
    }
}

