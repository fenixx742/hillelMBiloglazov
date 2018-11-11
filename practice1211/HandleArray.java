package com.hillel.practice1211;

public class HandleArray {
    public static int[] raiseSalary1(int[] a, int percent) {
        int [] updatedSalary = new int [a.length];
        for (int i = 0; i < a.length ; i++) {
            updatedSalary [i] = (int) (a[i] * (double)percent / 100) + a[i];
        } return updatedSalary;
    }
    public static void raiseSalary(int[] a, int percent) {
        for (int i = 0; i < a.length ; i++) {
          a [i] = (int) (a[i] * (double)percent / 100) + a[i];
        }
    }
}
