package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoStylePepperoniPizza extends PepperoniPizza {
    public ChicagoStylePepperoniPizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "Chicago Style Pepperoni Pizza";
    }
}
