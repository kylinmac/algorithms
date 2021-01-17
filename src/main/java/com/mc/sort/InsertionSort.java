package com.mc.sort;



public class InsertionSort implements Sort{

    public static void main(String[] args) {
        new InsertionSort().test();
    }


    public  void sort(int[] ints) {
        for (int j = 1; j < ints.length; j++) {
            int key = ints[j];
            int i = j - 1;
            while (i >= 0 && ints[i] < key) {
                ints[i+1]=ints[i];
                i--;
            }
            ints[i + 1] = key;
        }
    }

}
