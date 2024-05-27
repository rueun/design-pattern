package org.example.headfirst.chapter2.observer.weather.display;

import org.example.headfirst.chapter2.observer.weather.Observer;
import org.example.headfirst.chapter2.observer.weather.data.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private final WeatherData weatherData;

    public ForecastDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        calculateForecast(pressure);
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    private void calculateForecast(float pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
    }
}
