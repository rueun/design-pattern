package org.example.headfirst.chapter4.factory.pizzastore.pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings = new ArrayList<>(Arrays.asList("Grated Reggiano Cheese", "Fresh Clams from Long Island Sound"));
    }
}
