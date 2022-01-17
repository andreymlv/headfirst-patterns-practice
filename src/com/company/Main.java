package com.company;

import com.company.c3.Beverage;
import com.company.c3.Size;
import com.company.c3.Mocha;
import com.company.c3.Soy;
import com.company.c3.Whip;
import com.company.c3.Espresso;
import com.company.c3.HouseBlend;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Size.MEDIUM);
        System.out.println(beverage.print());

        Beverage beverage1 = new Whip(new Mocha(new Soy(new Soy(new HouseBlend(Size.LARGE)))));
        System.out.println(beverage1.print());
    }
}
