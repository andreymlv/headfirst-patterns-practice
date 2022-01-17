package com.company.c3;

public interface Beverage {
    String description();

    double cost();

    default Size size() {
        return Size.UNKNOWN;
    }

    default String print() {
        return size() + " " + description() + " $" + cost();
    }
}
