package org.example.headfirst.chapter4.factory.pizzastore;


import org.example.headfirst.chapter4.factory.pizzastore.pizza.Pizza;
import org.example.headfirst.chapter4.factory.pizzastore.store.ChicagoPizzaStore;
import org.example.headfirst.chapter4.factory.pizzastore.store.NYPizzaStore;
import org.example.headfirst.chapter4.factory.pizzastore.store.PizzaStore;

public class Simulator {
    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        final Pizza nyStoreCheesePizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyStoreCheesePizza.getName() + "\n");

        final Pizza chicagoStoreCheesePizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoStoreCheesePizza.getName() + "\n");
    }
}
