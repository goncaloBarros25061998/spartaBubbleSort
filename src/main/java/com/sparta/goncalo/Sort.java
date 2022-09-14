package com.sparta.goncalo;

public class Sort implements Sorter {
    @Override
    public int[] bubbleSort(int[] arrayToSort) {
        int len = arrayToSort.length;
        for (int i = 0; i < len - 1; ++i) {
            for (int j = 0; j < len - i - 1; ++j) {
                if (arrayToSort[j + 1] < arrayToSort[j]) {
                    int swap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j + 1];
                    arrayToSort[j + 1] = swap;
                }
            }
        }
        return arrayToSort;
    }

    @Override
    public int[] mergeSort(int[] arrayToSort) {
        int len = arrayToSort.length;
        // very if len >=1
        if (len <= 1) {
            return arrayToSort;
        }
        //need to add some left and right functions
        //
       // int[] left  = new int[];
        return new int[0];

    }
}
