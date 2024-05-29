package org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient;

import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.cheese.Cheese;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.cheese.MozzarellaCheese;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.cheese.ReggianoCheese;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.clams.Clams;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.clams.FreshClams;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.clams.FrozenClams;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.dough.Dough;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.dough.ThickCrustDough;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.dough.ThinCrustDough;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.pepperoni.Pepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.pepperoni.SlicedPepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.sauce.MarinaraSauce;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.sauce.PlumTomatoSauce;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.sauce.Sauce;
import org.example.headfirst.chapter4.factory.pizzastore.pizza.ingredient.veggie.*;

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
