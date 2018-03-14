package com.apuliasoft.designpattern.strategy.example;

public class NoFlyBehaviour implements IFlyBehaviour {
    public void fly() {
        System.out.println("I can't fly!");
    }
}