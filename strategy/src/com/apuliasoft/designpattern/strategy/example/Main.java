package com.apuliasoft.designpattern.strategy.example;

public class Main {
    public static void main(String[] args) {
        // Run behaviour A
        ISortBehaviour bubbleSortBehaviour = new BubbleSortBehaviour();
        List bubbleSortedList = new List(bubbleSortBehaviour);
        bubbleSortedList.sort();

        // Run behaviour B
        ISortBehaviour mergeSortBehaviour = new MergeSortBehaviour();
        List mergeSortedList = new List(mergeSortBehaviour);
        mergeSortedList.sort();
    }
}