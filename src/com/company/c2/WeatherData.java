package com.company.c2;

import java.util.ArrayList;

public class WeatherData implements Source, Target {
    private final ArrayList<Target> targets;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        targets = new ArrayList<>();
    }

    @Override
    public void registerTarget(Target target) {
        targets.add(target);
    }

    @Override
    public void removeTarget(Target target) {
        targets.remove(target);
    }

    @Override
    public void notifyTargets() {
        for (Target target : targets) {
            target.update();
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    @Override
    public void update() {
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        notifyTargets();
    }

}
