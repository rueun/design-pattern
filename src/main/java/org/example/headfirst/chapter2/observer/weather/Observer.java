package org.example.headfirst.chapter2.observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
