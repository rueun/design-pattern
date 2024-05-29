package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.cheese.Cheese;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.cheese.MozzarellaCheese;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.clams.Clams;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.clams.FrozenClams;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.dough.Dough;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.dough.ThickCrustDough;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.pepperoni.Pepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.pepperoni.SlicedPepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.sauce.PlumTomatoSauce;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.sauce.Sauce;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.BlackOlives;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.EggPlant;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.Spinach;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[] {new BlackOlives(), new Spinach(), new EggPlant()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
