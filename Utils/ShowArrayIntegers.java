package com.hillel.Utils;

public class ShowArrayIntegers {
    public static void showArray (int []a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("P" + i + ": " + a[i] + " y;" + " ");
        }
        System.out.println();
    }
}
