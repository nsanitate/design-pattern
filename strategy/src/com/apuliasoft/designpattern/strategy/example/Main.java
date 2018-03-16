package com.apuliasoft.designpattern.strategy.example;

public class Main {
    public static void main(String[] args) {
        // Run behaviour A
        IFlyBehaviour simpleFlyBehaviour = new SimpleFlyBehaviour();
        Duck simpleFlyingDuck = new Duck(simpleFlyBehaviour);
        simpleFlyingDuck.fly();

        // Run behaviour B
        IFlyBehaviour noFlyBehaviour = new NoFlyBehaviour();
        Duck noFlyingDuck = new Duck(noFlyBehaviour);
        noFlyingDuck.fly();
    }
}