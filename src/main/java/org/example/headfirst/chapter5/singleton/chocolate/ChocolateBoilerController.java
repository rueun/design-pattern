package org.example.headfirst.chapter5.singleton.chocolate;

public class ChocolateBoilerController {
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

        // enum singleton
        final ChocolateBoilerEnum boilerEnum1 = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        boilerEnum1.fill();
        boilerEnum1.boil();
        boilerEnum1.drain();

        final ChocolateBoilerEnum boilerEnum2 = ChocolateBoilerEnum.UNIQUE_INSTANCE;
        boilerEnum2.fill();
        boilerEnum2.boil();
        boilerEnum2.drain();

        boolean sameEnumInstance = boilerEnum1 == boilerEnum2;
        System.out.println("Are both enum instances the same? " + sameEnumInstance);

    }
}
