package com.apuliasoft.designpattern.observer.explanation;

import java.util.ArrayList;
import java.util.List;

public interface IObservable {
    List<IObserver> observers = new ArrayList<IObserver>();

    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyObservers();
}