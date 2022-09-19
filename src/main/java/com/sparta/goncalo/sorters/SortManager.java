package com.sparta.goncalo.sorters;

import com.sparta.goncalo.sorters.BubbleSort;
import com.sparta.goncalo.sorters.MergeSort;
import com.sparta.goncalo.sorters.Sorter;

import java.util.Arrays;

public class SortManager {
    public int[] bubbleSort(int[] arrayToSort){
        BubbleSort bubbleSort = new BubbleSort();
        return bubbleSort.sort(arrayToSort);
    }
    public int[] mergeSort(int[] arrayToSort){
        MergeSort mergeSort = new MergeSort();
        return mergeSort.sort(arrayToSort);
    }
    public int[] treeSort(int[] arrayToSort){
        TreeSort treeSort = new TreeSort();
        return treeSort.sort(arrayToSort);
    }

}
