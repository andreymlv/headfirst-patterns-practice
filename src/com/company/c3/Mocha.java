package com.company.c3;

public final class Mocha implements Beverage {

    private final Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public Size size() {
        return beverage.size();
    }
}
