package com.sparta.goncalo.sorters;

import java.util.Arrays;

public class TreeSort implements Sorter {

    @Override
    public int[] sort(int[] arrayToSort) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        Integer[] integerArray = Arrays.stream(arrayToSort).boxed().toArray(Integer[]::new);
        return bst.treeSort(integerArray);
    }

}