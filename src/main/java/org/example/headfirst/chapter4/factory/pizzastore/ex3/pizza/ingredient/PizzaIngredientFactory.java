package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.cheese.Cheese;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.clams.Clams;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.dough.Dough;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.pepperoni.Pepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.sauce.Sauce;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
