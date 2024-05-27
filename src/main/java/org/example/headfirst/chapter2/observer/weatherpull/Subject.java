package org.example.headfirst.chapter2.observer.weatherpull;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
