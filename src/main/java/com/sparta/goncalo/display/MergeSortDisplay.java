package com.sparta.goncalo.display;

public class MergeSortDisplay {
    public void printAlgorithm(){
        System.out.println("Algorithm : MergeSort");
    }

    public void printArray(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; ++i) {
            System.out.print(arrayToPrint[i] + " ");
        }
    }
}
