package com.sparta.goncalo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            int [] array ={4, 1, 3, 9, 7};
            int len = array.length;
           // sortArray(array, len);

         Sort sorte = new Sort();
          array = sorte.sortArray(array, len);


            for(int i = 0; i<len; ++i){
                System.out.println(array[i]+ " ");
            }

        System.out.println(sorte);

    }
}