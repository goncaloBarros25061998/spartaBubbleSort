package com.sparta.goncalo.sorters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MergeSort implements Sorter {
    private static final Logger log = LogManager.getLogger(MergeSort.class);

    @Override
    public int[] sort(int[] arrayToSort) {
        int len = arrayToSort.length;
        log.warn("Array Size : " + len);
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
        sort(left);
        sort(right);
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
