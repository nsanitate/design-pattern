package com.apuliasoft.designpattern.strategy.example;

public class MergeSortBehaviour implements ISortBehaviour {
    public List sort(List list) {
        System.out.println("Merge sort");
        return list;
    }
}