package com.sparta.goncalo;

public class Sort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort, int len) {

        for (int i=0; i<len-1; ++i){
            for (int j=0; j<len-i-1; ++j){
                if(arrayToSort[j+1]<arrayToSort[j]){
                    int swap = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = swap;
                }
            }
        }
        return arrayToSort;
    }
}
