package org.example.headfirst.chapter2.observer.weather.display;

import org.example.headfirst.chapter2.observer.weather.Observer;
import org.example.headfirst.chapter2.observer.weather.data.WeatherData;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private final WeatherData weatherData;

    public CurrentConditionDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf(("Current conditions: %sF degrees and %s humidity and %s pressure%n"), temperature, humidity, pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
