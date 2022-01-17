package com.company.c2.display;

import com.company.c2.DisplayElement;
import com.company.c2.Target;
import com.company.c2.WeatherData;

public class CurrentConditionsDisplay implements Target, DisplayElement {
    private final WeatherData weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
