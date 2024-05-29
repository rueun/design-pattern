package org.example.headfirst.chapter4.factory.pizzastore.ex3.store;

import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.*;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.ChicagoPizzaIngredientFactory;
import org.example.headfirst.chapter4.factory.pizzastore.ex3.pizza.ingredient.PizzaIngredientFactory;

// 생산하는 클래스. 구상 생산자 클래스
public class ChicagoPizzaStore extends PizzaStore {

    private final PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    protected Pizza createPizza(final String type) { // 팩토리 메서드
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza(ingredientFactory);
            case "veggie" -> new ChicagoStyleVeggiePizza(ingredientFactory);
            case "clam" -> new ChicagoStyleClamPizza(ingredientFactory);
            case "pepperoni" -> new ChicagoStylePepperoniPizza(ingredientFactory);
            default -> throw new IllegalArgumentException("Unexpected value: " + type);
        };
    }
}
