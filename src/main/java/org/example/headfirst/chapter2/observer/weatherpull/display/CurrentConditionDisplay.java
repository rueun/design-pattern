package org.example.headfirst.chapter2.observer.weatherpull.display;

import org.example.headfirst.chapter2.observer.weatherpull.Observer;
import org.example.headfirst.chapter2.observer.weatherpull.data.WeatherData;

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
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        display();
    }
}
