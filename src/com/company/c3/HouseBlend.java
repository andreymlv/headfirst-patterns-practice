package com.company.c3;

public record HouseBlend(Size size) implements Beverage {
    @Override
    public String description() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
