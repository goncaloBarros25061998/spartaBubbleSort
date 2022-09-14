package com.sparta.goncalo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the sorting Algorithm");
        String [] algorithms ={"1-BobbleSort", "2-MergeSort"};
        for (String algorithm : algorithms){
            System.out.println(algorithm);
        }
        int algorithm = scanner.nextInt();
        System.out.println("Whats the length of the Array");
        int length = scanner.nextInt();
        int[] array = new int[length];
        Random random = new Random();
        for(int i=0; i<length; i++){
            array[i] = random.nextInt(10 +1 ) + 1;
        }

        Sort sort = new Sort();
        if ( algorithm == 1 ){
            array = sort.bubbleSort(array);
        } else if(algorithm ==2 ){
            array = sort.mergeSort(array);
        }



        for (int i = 0; i < array.length; ++i) {
            System.out.println(array[i] + " ");
        }


    }
}