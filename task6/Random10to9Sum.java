package com.hillel.task6;

import com.hillel.Utils.MathRandomNumsMin10to9;

public class Random10to9Sum {
    public static void summition100 () {
        int sum = 0;
        for (int i = 0; i <= 100 ; i++) {
           int randomNums = MathRandomNumsMin10to9.getRandomNums(0,20);
             sum += randomNums;
        }
        System.out.println(sum);
    }
}
