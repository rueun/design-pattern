package org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.cheese.Cheese;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.clams.Clams;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.dough.Dough;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.pepperoni.Pepperoni;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.sauce.Sauce;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.veggie.Veggies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    }
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자를 담기");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough.getName());
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce.getName());
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese.getName());
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i].getName());
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam.getName());
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni.getName());
            result.append("\n");
        }
        return result.toString();
    }
}
