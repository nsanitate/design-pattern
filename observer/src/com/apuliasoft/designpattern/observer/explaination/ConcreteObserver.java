package com.apuliasoft.designpattern.observer.explaination;

public class ConcreteObserver implements IObserver {

    private ConcreteObservable concreteObservable;

    public ConcreteObserver(ConcreteObservable concreteObservable) {
        this.concreteObservable = concreteObservable;
    }

    public void update() {
        // Run update behaviour
    }
}