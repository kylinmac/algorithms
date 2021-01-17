package com.mc.utils.facotry;


import java.util.Random;

public class CreateDataFactory {

    static Random random = new Random();

    public static int[] createInts(int n) {
        return createInts(n,1000);
    }

    public static int[] createInts(int n, int max) {
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = random.nextInt(2*max)-max;
        }
        return ints;
    }
    public static int[] createInts() {
        int i = random.nextInt(100);
        return createInts(i);
    }
}
