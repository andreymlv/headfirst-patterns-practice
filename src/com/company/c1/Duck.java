package com.company.c1;

public abstract class Duck {

    public abstract void display();

    public void preformFly(FlyBehavior flyBehavior) {
        flyBehavior.fly();
    }

    public void preformQuack(QuackBehavior quackBehavior) {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

}
