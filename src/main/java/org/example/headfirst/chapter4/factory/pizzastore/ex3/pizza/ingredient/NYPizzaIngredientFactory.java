package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.cheese.Cheese;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.cheese.ReggianoCheese;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.clams.Clams;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.clams.FreshClams;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.dough.Dough;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.dough.ThinCrustDough;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.pepperoni.Pepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.pepperoni.SlicedPepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.sauce.MarinaraSauce;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.sauce.Sauce;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
