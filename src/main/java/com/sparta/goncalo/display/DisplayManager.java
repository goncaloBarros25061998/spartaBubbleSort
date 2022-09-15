package com.sparta.goncalo.display;

import com.sparta.goncalo.sorters.BubbleSort;
import com.sparta.goncalo.sorters.MergeSort;
import com.sparta.goncalo.sorters.SortManager;

import java.util.Random;
import java.util.Scanner;

public class DisplayManager {
    private long start;
    private long end;
    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the sorting Algorithm");
        String [] algorithms ={"1-BobbleSort", "2-MergeSort"};
        for (String algorithm : algorithms){
            System.out.println(algorithm);
        }
        int algorithm = scanner.nextInt();
        System.out.println("Whats the length of the Array!");
        int length = scanner.nextInt();
        int[] array = new int[length];
        Random random = new Random();
        for(int i=0; i<length; i++){
            array[i] = random.nextInt(10 +1 ) + 1;
        }
        System.out.print("Unsorted Array: ");


        SortManager sortManager = new SortManager();
        this.startTime();
        if ( algorithm == 1 ){
            BubbleSortDisplay  bubbleSortDisplay= new BubbleSortDisplay() ;
            bubbleSortDisplay.printArray(array);
            bubbleSortDisplay.printAlgorithm();

            array = sortManager.bubbleSort(array);
            this.endTime();
            bubbleSortDisplay.printArray(array);
        } else if(algorithm ==2 ){
            MergeSortDisplay mergeSortDisplay = new MergeSortDisplay();
           mergeSortDisplay.printArray(array);
           mergeSortDisplay.printAlgorithm();
           array= sortManager.mergeSort(array);
           this.endTime();
           mergeSortDisplay.printArray(array);
        }

       printExecutionTime();


    }
    public void startTime(){
        this.start = System.nanoTime();
    }

    public void endTime(){
        this.end = System.nanoTime();
    }
    public void printExecutionTime(){
        long execution = end - start;
        System.out.println("\nExecution time: " + execution + " nanoseconds");
    }
}
