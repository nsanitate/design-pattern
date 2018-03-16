package com.apuliasoft.designpattern.observer.example;

import com.apuliasoft.designpattern.observer.explaination.IObserver;
import com.apuliasoft.designpattern.observer.explaination.WeatherStation;
import com.apuliasoft.designpattern.observer.explaination.WindowDisplay;

public class Main {
    public static void main(String[] args) {
        // Create Observable
        WeatherStation weatherStation = new WeatherStation();

        // Create first Observer and add to Observable
        IObserver phoneDisplay = new PhoneDisplay(weatherStation);
        weatherStation.add(phoneDisplay);

        // Create second Observer and add to Observable
        IObserver windowDisplay = new WindowDisplay(weatherStation);
        weatherStation.add(windowDisplay);

        // Update Observable state
        weatherStation.setTemperature(10);
    }
}