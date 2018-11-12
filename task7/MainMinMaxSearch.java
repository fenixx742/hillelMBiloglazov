package com.hillel.task7;

public class MainMinMaxSearch {
    public static void main(String[] args) {

       int [] array1 = {-10, 20, 34, -11, 100, 20};
       double [] array2 = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};

      int maximum = FindMinMax.getMax(array1);
      int minimum = FindMinMax.getMin(array1);
      double maximumD = FindMinMax.getMax(array2);
      double minimumD = FindMinMax.getMin(array2);

        System.out.println("This is maximum for array with INTS " + maximum);
        System.out.println("This is minimum for array with INTS " + minimum);
        System.out.println("This is maximum for array with DBLS " + maximumD);
        System.out.println("This is minimum for array with DBLS " + minimumD);
    }
}
