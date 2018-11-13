package com.hillel.task9;
import com.hillel.Utils.FindMinMax;

public class ArrayMinMaxChange {
    public static double [] getChange (double [] arr) {
        double [] updatedArrayD = new double[arr.length];
        double maxD = FindMinMax.getMax(arr);
        double minD = FindMinMax.getMin(arr);

        for (int i = 0; i < arr.length; i++) {

            updatedArrayD[i] = arr[i];

            if (arr[i] == maxD) {
                updatedArrayD[i] = minD;
            } else if (arr[i] == minD){
                updatedArrayD[i] = maxD;
            }
        }
        return updatedArrayD;
    }
}
