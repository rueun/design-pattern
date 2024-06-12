package org.example.headfirst.chapter7.adapter.simple;

public class DuckTestDrive {
    public static void main(String[] args) {
        final MallardDuck duck = new MallardDuck();
        final Turkey turkey = new WildTurkey();

        final Duck turkeyAdapter = new TurkeyAdapter(turkey);
        final Turkey duckAdapter = new DuckAdapter(duck);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        duck.quack();

        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("\nThe DuckAdapter says...");
        duckAdapter.gobble();
        duckAdapter.fly();
    }
}
