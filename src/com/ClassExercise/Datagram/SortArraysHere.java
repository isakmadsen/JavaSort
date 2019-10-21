package com.ClassExercise.Datagram;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class SortArraysHere {

    public static void main(String[] args) {

        Random rd = new Random(); // creating Random object
        int[] arr = new int[20000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(); // storing random integers in an array
        }

        Context con = new Context(new QuickSort(arr, 0, Array.getLength(arr)-1));
        Context con1 = new Context(new BubbleSort());
        Context con2 = new Context(new MergeSort(arr, Array.getLength(arr)));
        Context con3 = new Context(new BogoSort());

        System.out.println("This is quicksort: " + Arrays.toString(con.executeStrat(arr)));
        System.out.println("This is bubblesort: " + Arrays.toString(con1.executeStrat(arr)));
        System.out.println("This is mergesort: " + Arrays.toString(con2.executeStrat(arr)));
        System.out.println("This is bogo: " + Arrays.toString(con3.executeStrat(arr)));

    }
}
