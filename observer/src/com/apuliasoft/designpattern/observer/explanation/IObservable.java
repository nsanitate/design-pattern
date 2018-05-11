package com.apuliasoft.designpattern.observer.explanation;

public interface IObservable {
    List<IObserver> observers;

    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
}