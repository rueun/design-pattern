package org.example.headfirst.chapter2.observer.weather.display;

import org.example.headfirst.chapter2.observer.weather.Observer;
import org.example.headfirst.chapter2.observer.weather.data.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float minTemp = 200;
    private float maxTemp = 0;
    private float sumTemp;
    private int numReadings;
    private final WeatherData weatherData;

    public StatisticsDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.printf("Statistics: Avg/Max/Min temperature = %s/%s/%s%n", (sumTemp / numReadings), maxTemp, minTemp);
    }

    public void update(float temp, float humidity, float pressure) {
        calculateStatistics(temp);
        display();
    }

    private void calculateStatistics(float temp) {
        sumTemp += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }
    }
}
