package com.sparta.goncalo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortTest {

    @Test
    void bubbleSortTest() {
       int unsortedArray[] = {4, 1, 3, 9, 7};
       int sortedArray[] = {1, 3, 4, 7, 9};
       Sort sort = new Sort();

       unsortedArray = sort.bubbleSort(unsortedArray);
       Assertions.assertArrayEquals(sortedArray, unsortedArray);
    }

    @Test
    void  mergeSortTest(){
        int unsortedArray[] = {4, 1, 3, 9, 7};
        int sortedArray[] = {1, 3, 4, 7, 9};
        Sort sort = new Sort();
        unsortedArray = sort.mergeSort(unsortedArray);
        Assertions.assertArrayEquals(sortedArray, unsortedArray);
    }
}