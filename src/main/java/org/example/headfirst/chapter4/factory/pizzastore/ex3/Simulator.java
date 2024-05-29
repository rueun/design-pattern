package org.example.headfirst.chapter4.factory.pizzastore.ex3;


import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.Pizza;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.store.ChicagoPizzaStore;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.store.NYPizzaStore;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.store.PizzaStore;

public class Simulator {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        final Pizza nystyleVeggiePizza = nyStore.orderPizza("veggie");
        System.out.println("nystyleVeggiePizza = " + nystyleVeggiePizza);

        final Pizza chicagoStyleCheesePizza = chicagoStore.orderPizza("cheese");
        System.out.println("chicagoStyleCheesePizza = " + chicagoStyleCheesePizza);
    }
}
