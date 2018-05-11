package com.apuliasoft.designpattern.observer.explanation;

import java.util.List;

public class ConcreteObservable implements IObservable {
    public void add(IObserver observer) {
        observers.add(observer);
    }

    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }

    // Return internal state
    public Object getState() {
        return null;
    }
}