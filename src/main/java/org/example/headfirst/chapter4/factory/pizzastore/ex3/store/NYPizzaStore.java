package org.example.headfirst.chapter4.factory.pizzastore.ex3.store;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.*;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.NYPizzaIngredientFactory;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class NYPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(final String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza(ingredientFactory);
            case "veggie" -> new NYStyleVeggiePizza(ingredientFactory);
            case "clam" -> new NYStyleClamPizza(ingredientFactory);
            case "pepperoni" -> new NYStylePepperoniPizza(ingredientFactory);
            default -> throw new IllegalArgumentException("Unexpected value: " + type);
        };
    }
}
