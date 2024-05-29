package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class NYStyleVeggiePizza extends VeggiePizza {

    public NYStyleVeggiePizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "NY Style Veggie Pizza";
    }

}
