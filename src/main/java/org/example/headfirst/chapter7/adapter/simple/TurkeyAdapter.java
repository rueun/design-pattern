package org.example.headfirst.chapter7.adapter.simple;

public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public TurkeyAdapter(final Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        // Turkeys can only fly short distances
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
