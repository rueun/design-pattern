package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class NYStyleClamPizza extends ClamPizza {
    public NYStyleClamPizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "NY Style Clam Pizza";
    }
}
