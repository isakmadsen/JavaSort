package com.ClassExercise.Datagram;

public class Context {

    private SortMain sortStrategy;

    public Context(SortMain sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public int[] executeStrat(int arr[]){
        return sortStrategy.sortStrategy(arr);
    }
}
