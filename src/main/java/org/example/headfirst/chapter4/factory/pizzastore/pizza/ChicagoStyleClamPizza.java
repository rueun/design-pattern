package org.example.headfirst.chapter4.factory.pizzastore.pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings = new ArrayList<>(Arrays.asList("Shredded Mozzarella Cheese", "Frozen Clams from Chesapeake Bay"));
    }
}
