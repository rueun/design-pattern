package org.example.headfirst.chapter2.observer.weatherpull.data;

import org.example.headfirst.chapter2.observer.weatherpull.Observer;
import org.example.headfirst.chapter2.observer.weatherpull.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    /**
     * Register an observer
     * @param observer
     */
    @Override
    public void registerObserver(final Observer observer) {
        observers.add(observer);
    }

    /**
     * Remove an observer
     * @param observer
     */
    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notify all observers
     */
    @Override
    public void notifyObservers() {
        for (final Observer observer : observers) {
            observer.update();
        }
    }

    /**
     * 기상 스테이션으로부터 갱신된 측정 값을 받고 호출 - Notify all observers
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(final float temperature, final float humidity, final float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
