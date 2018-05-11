package com.apuliasoft.designpattern.observer.explanation;

public class WindowDisplay implements IObserver {

    private WeatherStation weatherStation;

    public WindowDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void update() {
        System.out.println("Window:" + weatherStation.getTemperature());
    }
}