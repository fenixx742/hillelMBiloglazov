package com.hillel.Utils;

public class FindMinMax {
    public static int getMin (int [] a) {
        int min = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        } return min;
    }

    public static int getMax (int [] a) {
        int max = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        } return max;
    }

    public static double getMin (double [] a) {
        double min = a[0];
        for (int i = 0; i <a.length ; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        } return min;
    }

    public static double getMax (double [] a) {
        double max = a[0];

        for (int i = 0; i <a.length ; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        } return max;
    }
}
