package org.example.headfirst.chapter4.factory.pizzastore.ex2.store;

import org.example.headfirst.chapter4.factory.pizzastore.ex2.pizza.Pizza;

// 추상 생산자 클래스
public abstract class PizzaStore {

    public Pizza orderPizza(final String type) {
        final Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    protected abstract Pizza createPizza(final String type);
}
