package org.example.headfirst.chapter2.observer.weather;

import org.example.headfirst.chapter2.observer.weather.data.WeatherData;
import org.example.headfirst.chapter2.observer.weather.display.CurrentConditionDisplay;
import org.example.headfirst.chapter2.observer.weather.display.ForecastDisplay;
import org.example.headfirst.chapter2.observer.weather.display.HeatIndexDisplay;
import org.example.headfirst.chapter2.observer.weather.display.StatisticsDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        final WeatherData weatherData = new WeatherData();

        final CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        final StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        final ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        final HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println("--------------------------------------------------");
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println("--------------------------------------------------");
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
