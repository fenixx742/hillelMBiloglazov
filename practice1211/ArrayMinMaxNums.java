package com.hillel.practice1211;


public class ArrayMinMaxNums {
    public static int getMin (int [] a) {
      int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
     return min;
   }
   public static double getMin (double [] a) {
        double min = a[0];
       for (int i = 0; i < a.length ; i++) {
           if ( a[i] < min) {
               min = a[i];
           }
       }
        return min;
   }
}

