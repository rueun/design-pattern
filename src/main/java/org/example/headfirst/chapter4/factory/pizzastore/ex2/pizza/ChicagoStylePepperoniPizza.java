package org.example.headfirst.chapter4.factory.pizzastore.ex2.pizza;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings = new ArrayList<>(List.of("Shredded Mozzarella Cheese", "Black Olives", "Spinach", "Eggplant", "Sliced Pepperoni"));
    }
}
