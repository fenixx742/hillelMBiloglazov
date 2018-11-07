package com.hillel.task6;

import com.hillel.Utils.MathRandomNums20to20;

public class Random20to20Sum {
    public static void summition100 () {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
           int randomNums = MathRandomNums20to20.getRandomNums(0,40);
             sum += randomNums;
        }
        System.out.println(sum);
    }
}
