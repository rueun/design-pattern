package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends CheesePizza {

    public ChicagoStyleCheesePizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "Chicago Style Deep Dish Cheese Pizza";
    }
}
