package com.mc.sort;

import com.mc.utils.facotry.CreateDataFactory;

import java.util.Arrays;

public interface Sort {

    default  void  test(){
        int[] ints = CreateDataFactory.createInts(5);
        System.out.println(Arrays.toString(ints));
        this.sort(ints);
        System.out.println(Arrays.toString(ints));
    }

    void sort(int[] ints);
}
