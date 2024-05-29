package org.example.headfirst.chapter4.factory.pizzastore.pizza;

import java.util.ArrayList;
import java.util.List;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings = new ArrayList<>(List.of("Grated Reggiano Cheese"));
    }
}
