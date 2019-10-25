package com.ClassExercise.Datagram;

public class QuickSort extends SortMain {

    private int[] arr;
    private int begin;
    private int end;

    public QuickSort(int[] arr, int begin, int end) {
        this.arr = arr;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public int[] sortStrategy(int[] arr) {
        arr=quickSort(arr,begin, end);
        return arr;
    }

    public int[] quickSort(int arr[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex-1);
            quickSort(arr, partitionIndex+1, end);
        }
    return arr;
    }

    public int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }

}
