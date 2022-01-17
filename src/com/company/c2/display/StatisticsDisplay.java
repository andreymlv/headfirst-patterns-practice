package com.company.c2.display;

import com.company.c2.DisplayElement;
import com.company.c2.Target;
import com.company.c2.WeatherData;

public class StatisticsDisplay implements Target, DisplayElement {

    private final WeatherData weatherData;
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerTarget(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        tempSum += temperature;
        numReadings++;
        if (temperature > maxTemp) {
            maxTemp = temperature;
        }
        if (temperature < minTemp) {
            minTemp = temperature;
        }
        display();
    }

    @Override
    public void update() {
        float temp = weatherData.getTemperature();
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        display();
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }
}
