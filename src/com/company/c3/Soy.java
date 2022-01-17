package com.company.c3;

public final class Soy implements Beverage {
    private final Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Soy";
    }

    @Override
    public double cost() throws RuntimeException {
        switch (beverage.size()) {
            case SMALL -> {
                return beverage.cost() + 0.1;
            }
            case MEDIUM -> {
                return beverage.cost() + 0.15;
            }
            case LARGE -> {
                return beverage.cost() + 0.2;
            }
            default -> throw new RuntimeException("Cost is not provided.");
        }
    }

    @Override
    public Size size() {
        return beverage.size();
    }
}
