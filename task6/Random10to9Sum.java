package com.hillel.task6;

import com.hillel.Utils.RandomNumsUniversal;

public class Random10to9Sum {
    public static void summition100 () {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
           int randomNums = RandomNumsUniversal.randomNums(-10,8);
             sum += randomNums;
        }
        System.out.println(sum);
    }
}
