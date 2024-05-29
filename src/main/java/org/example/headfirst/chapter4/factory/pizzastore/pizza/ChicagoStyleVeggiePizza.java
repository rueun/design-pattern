package org.example.headfirst.chapter4.factory.pizzastore.pizza;

import java.util.ArrayList;
import java.util.Arrays;

public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings = new ArrayList<>(Arrays.asList("Shredded Mozzarella Cheese", "Black Olives", "Spinach", "Eggplant"));
    }
}
