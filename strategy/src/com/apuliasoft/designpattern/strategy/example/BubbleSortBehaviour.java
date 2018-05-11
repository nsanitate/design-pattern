package com.apuliasoft.designpattern.strategy.example;

public class BubbleSortBehaviour implements ISortBehaviour {
    public List sort(List list) {
        System.out.println("Bubble sort");
        return list;
    }
}