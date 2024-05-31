package org.example.headfirst.chapter5.singleton.chocolate;

public class Simulator {
    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        boiler2.fill();
        boiler2.boil();
        boiler2.drain();
        
        boolean sameInstance = boiler == boiler2;
        System.out.println("Are both instances the same? " + sameInstance);
    }
}
