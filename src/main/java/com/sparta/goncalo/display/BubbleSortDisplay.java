package com.sparta.goncalo.display;

public class BubbleSortDisplay {
    public void printAlgorithm(){
        System.out.println("Algorithm: BubbleSort");
    }
    public void printArray(int[] arrayToPrint){
        for (int i = 0; i < arrayToPrint.length; ++i) {
            System.out.print(arrayToPrint[i] + " ");
        }
    }
}
