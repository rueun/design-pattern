package org.example.headfirst.chapter4.factory.pizzastore.pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings = new ArrayList<>(Arrays.asList("Grated Reggiano Cheese", "Garlic", "Onion", "Mushrooms", "Red Pepper"));
    }
}
