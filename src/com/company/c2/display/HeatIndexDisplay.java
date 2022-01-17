package com.company.c2.display;

import com.company.c2.DisplayElement;
import com.company.c2.Target;
import com.company.c2.WeatherData;

public class HeatIndexDisplay implements Target, DisplayElement {

    private final WeatherData weatherData;
    private float temp;
    private float hum;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Heat index is " + computeHeatIndex(temp, hum));
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        temp = temperature;
        hum = humidity;
        display();
    }

    @Override
    public void update() {
        temp = weatherData.getTemperature();
        hum = weatherData.getHumidity();
        display();
    }

    private float computeHeatIndex(float t, float rh) {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }
}
