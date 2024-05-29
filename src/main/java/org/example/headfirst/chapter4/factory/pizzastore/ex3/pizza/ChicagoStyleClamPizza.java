package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends ClamPizza {
    public ChicagoStyleClamPizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "Chicago Style Clam Pizza";
    }
}
