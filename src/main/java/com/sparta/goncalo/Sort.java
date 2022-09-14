package com.sparta.goncalo;

import java.util.Arrays;

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
        int middle = len / 2;
        int[] left = new int[middle];
        int[] right = new int[len - middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arrayToSort[i];
        }
        for (int j = middle; j < len; j++) {
            right[j - middle] = arrayToSort[j];
        }
        mergeSort(left);
        mergeSort(right);
        //need to add some left and right functions
        //
        // int[] left  = new int[];
        return merge(arrayToSort, left, right);

    }

    public int[] merge(int[] arrayToSort, int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int leftLen = left.length;
        int rightLen = right.length;
        while (i < leftLen && j < rightLen) {
            if (left[i] < right[j]) {
                arrayToSort[k++] = left[i++];
            } else {
                arrayToSort[k++] = right[j++];
            }
        }
        while (i < leftLen) {
            arrayToSort[k++] = left[i++];
        }
        while (j < rightLen) {
            arrayToSort[k++] = right[j++];
        }
        return arrayToSort;
    }

}
