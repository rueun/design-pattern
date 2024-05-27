package org.example.headfirst.chapter2.observer.weatherpull.display;

import org.example.headfirst.chapter2.observer.weatherpull.Observer;
import org.example.headfirst.chapter2.observer.weatherpull.data.WeatherData;

public class HeatIndexDisplay implements Observer, DisplayElement {
    private float heatIndex = 0.0f;
    private final WeatherData weatherData;

    public HeatIndexDisplay(final WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        heatIndex = computeHeatIndex(weatherData.getTemperature(), weatherData.getHumidity());
        display();
    }

    private float computeHeatIndex(final float t, final float rh) {
        float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
                + (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
                + (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        return index;
    }

    @Override
    public void display() {
        System.out.printf("Heat index is %s%n", heatIndex);
    }

}
