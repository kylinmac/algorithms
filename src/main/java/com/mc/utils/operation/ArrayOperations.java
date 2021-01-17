package com.mc.utils.operation;

public class ArrayOperations {

    public static void swap(int[] ints, int x, int y) {
        int z=ints[x];
        ints[x]=ints[y];
        ints[y]=z;
    }
}
