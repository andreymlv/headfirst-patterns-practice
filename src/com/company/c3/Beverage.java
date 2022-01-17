package com.company.c3;

public interface Beverage {
    String description();

    double cost() throws RuntimeException;

    default Size size() {
        return Size.UNKNOWN;
    }

    default String print() {
        return size() + " " + description() + " $" + cost();
    }
}
