package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class NYStyleCheesePizza extends CheesePizza {

    public NYStyleCheesePizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "NY Style Sauce and Cheese Pizza";
    }

    @Override
    public void cut() {
        System.out.println("피자를 사각형으로 자르기");
    }
}
