package org.example.headfirst.chapter4.factory.pizzastore.ex2.store;

import org.example.headfirst.chapter4.factory.pizzastore.ex2.pizza.*;

// 생산하는 클래스. 구상 생산자 클래스
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(final String type) { // 팩토리 메서드
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> throw new IllegalArgumentException("Unexpected value: " + type);
        };
    }
}
