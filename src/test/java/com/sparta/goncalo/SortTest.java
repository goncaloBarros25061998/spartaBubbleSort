package com.sparta.goncalo;

import com.sparta.goncalo.sorters.SortManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    void bubbleSortTest() {
       int unsortedArray[] = {4, 1, 3, 9, 7};
       int sortedArray[] = {1, 3, 4, 7, 9};
       SortManager sort = new SortManager();

       unsortedArray = sort.bubbleSort(unsortedArray);
       Assertions.assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    void  mergeSortTest(){
        int unsortedArray[] = {4, 1, 3, 9, 7};
        int sortedArray[] = {1, 3, 4, 7, 9};
        SortManager sort = new SortManager();
        unsortedArray = sort.mergeSort(unsortedArray);
        Assertions.assertArrayEquals(sortedArray, unsortedArray);
    }
}