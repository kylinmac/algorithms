package com.mc.sort;

import com.mc.utils.operation.ArrayOperations;

public class SelectionSort implements Sort {


    public static void main(String[] args) {
        new SelectionSort().test();
    }

    public void sort(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            int minI = i;
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[j] < ints[minI]) {
                    minI = j;
                }
            }
            ArrayOperations.swap(ints, i, minI);
        }
    }
}
