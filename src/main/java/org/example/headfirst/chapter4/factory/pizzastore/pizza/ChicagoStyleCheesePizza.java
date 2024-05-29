package org.example.headfirst.chapter4.factory.pizzastore.pizza;

import java.util.ArrayList;
import java.util.List;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings = new ArrayList<>(List.of("Shredded Mozzarella Cheese"));
    }

    @Override
    public void cut() {
        System.out.println("네모난 모양으로 피자 자르기");
    }
}

