package com.hillel.task9;

public class OppositeOrder {
    public static void getOpposite(int[] a) {

        for (int i = a.length - 1; i >= 0 ; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
