package com.sparta.goncalo.sorters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BubbleSort implements Sorter{
    public static Logger log = LogManager.getLogger(BubbleSort.class);
    @Override
    public int[] sort(int[] arrayToSort) {
        int len = arrayToSort.length;
        log.warn("Array Size : " + len);
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
