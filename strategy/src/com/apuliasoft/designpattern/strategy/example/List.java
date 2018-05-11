package com.apuliasoft.designpattern.strategy.example;

public class List {
    private ISortBehaviour sortBehaviour;

    public List (ISortBehaviour sortBehaviour) {
        this.sortBehaviour = sortBehaviour;
    }

    public List sort() {
        return this.sortBehaviour.sort(this);
    }
}