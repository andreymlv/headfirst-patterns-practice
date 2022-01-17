package com.company.c3;

public record Espresso(Size size) implements Beverage {
    @Override
    public String description() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
