package com.apuliasoft.designpattern.strategy.explanation;

public class Client {
    private IBehaviour behaviour;

    public Client (IBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void execute () {
        this.behaviour.run();
    }
}