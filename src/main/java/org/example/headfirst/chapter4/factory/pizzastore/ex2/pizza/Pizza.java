package org.example.headfirst.chapter4.factory.pizzastore.ex2.pizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.printf("준비 중: %s%n", name);
        System.out.printf("도우 준비 중: %s%n", dough);
        System.out.printf("소스 뿌리는 중: %s%n", sauce);
        System.out.println("토핑 추가 중: ");
        toppings.forEach(System.out::println);
    }

    public void bake() {
        System.out.println("175도에서 25분간 굽기");
    }

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자를 담기");
    }

    public void addTopping(final String topping) {
        toppings.add(topping);
    }

    public String getName() {
        return name;
    }
}
