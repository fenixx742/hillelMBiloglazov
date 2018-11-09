package com.hillel.practice0711;


public class MainArrays {
    public static void main(String[] args) {

      int [] aNums  = {2,1,10}; // array
      int len = aNums.length ;
        System.out.println(len);// find length
        System.out.println(aNums[2]); // find integer in array by position
        int sum = 0, average = 0;
        for (int i = 0; i < aNums.length; i++) { // using array length
            sum += aNums[i];// summition of nums in array by index i
            average = sum / aNums.length;
        }
        System.out.println(average);
    }
}
