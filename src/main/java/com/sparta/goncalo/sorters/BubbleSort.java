package com.sparta.goncalo.sorters;

public class BubbleSort implements Sorter{
    @Override
    public int[] sort(int[] arrayToSort) {
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
}
