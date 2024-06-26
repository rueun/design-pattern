package org.example.headfirst.chapter3.decorator.cafe;

import org.example.headfirst.chapter3.decorator.cafe.beverage.*;
import org.example.headfirst.chapter3.decorator.cafe.condiment.Mocha;
import org.example.headfirst.chapter3.decorator.cafe.condiment.Soy;
import org.example.headfirst.chapter3.decorator.cafe.condiment.Whip;

public class CafeApplication {

    public static void main(String[] args) {
        Beverage beverage = new Espresso(Size.TALL);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast(Size.GRANDE);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend(Size.VENTI);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
