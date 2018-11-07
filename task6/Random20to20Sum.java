package com.hillel.task6;

import com.hillel.Utils.RandomNumsUniversal;

public class Random20to20Sum {
    public static void summition100 () {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
           int randomNums = RandomNumsUniversal.randomNums(-20,20);
             sum += randomNums;
        }
        System.out.println(sum);
    }
}
