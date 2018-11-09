package com.hillel.Utils;

public class ArrayAverage {
    public static double getArrayAverage (int[] aNums) {
        int sum = 0, average = 0;

        for (int i = 0; i < aNums.length; i++) {
            sum += aNums[i];

        }
        average = sum / aNums.length;
        return average;
    }
}
