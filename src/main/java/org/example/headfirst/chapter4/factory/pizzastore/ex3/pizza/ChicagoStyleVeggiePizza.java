package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends VeggiePizza {

    public ChicagoStyleVeggiePizza(final PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        super.name = "Chicago Deep Dish Veggie Pizza";
    }

}
