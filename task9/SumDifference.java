package com.hillel.task9;

public class SumDifference {
    public static int getSumPlus (int [] a) {
        int num;
        int sumPlus = 0;

        for (int i = 0; i < a.length ; i++) {
            num = a[i];

            if (num >= 0) {
                sumPlus += a[i];
            }
        } return sumPlus;
    }

    public static int getSumMinus (int [] a) {
        int num;
        int sumMinus = 0;

        for (int i = 0; i < a.length ; i++) {
            num = a[i];

            if (num <= 0) {
                sumMinus += a[i];
            }
        } return sumMinus;
    }
}
