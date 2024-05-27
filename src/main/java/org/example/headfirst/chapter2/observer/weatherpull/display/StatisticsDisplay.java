package org.example.headfirst.chapter2.observer.weatherpull.display;

import org.example.headfirst.chapter2.observer.weatherpull.Observer;
import org.example.headfirst.chapter2.observer.weatherpull.data.WeatherData;

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

    @Override
    public void display() {
        System.out.printf("Statistics: Avg/Max/Min temperature = %s/%s/%s%n", (sumTemp / numReadings), maxTemp, minTemp);
    }

    @Override
    public void update() {
        calculateStatistics(weatherData.getTemperature());
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
