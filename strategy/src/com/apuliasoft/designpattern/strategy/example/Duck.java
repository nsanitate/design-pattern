package com.apuliasoft.designpattern.strategy.example;

public class Duck {
    private IFlyBehaviour flyBehaviour;

    public Duck (IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void fly () {
        this.flyBehaviour.fly();
    }
}