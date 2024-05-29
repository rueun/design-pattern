package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends PepperoniPizza {
    public NYStylePepperoniPizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "NY Style Pepperoni Pizza";
    }
}
