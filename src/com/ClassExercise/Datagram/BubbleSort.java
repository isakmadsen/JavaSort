package com.ClassExercise.Datagram;

public class BubbleSort implements SortMain{
    // Java program for implementation of Bubble Sort

    public int[] sortStrategy(int[] arr){
       return bubbleSort(arr);
    }

    public int[] bubbleSort(int arr[]) {
            int n = arr.length;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swap temp and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        return arr;
    }

    }
