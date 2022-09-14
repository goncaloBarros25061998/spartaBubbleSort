package com.sparta.goncalo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 1, 3, 9, 7};
        // int len = array.length;
        // sortArray(array, len);

        Sort sorte = new Sort();
        array = sorte.bubbleSort(array);


        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i] + " ");
        }

        System.out.println(sorte);

    }
}