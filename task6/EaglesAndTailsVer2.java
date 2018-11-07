package com.hillel.task6;

import com.hillel.Utils.MathRandomNums;

public class EaglesAndTailsVer2 {
    public static void randomCalc() {
        int sumZeros = 0;
        int sumOnes = 0;

        for (int tries = 1; tries <= 2000; tries++) {

            int check = MathRandomNums.getRandomNums(0, 1);

            if (check == 0) {
                sumZeros++;
            }
            if (check == 1) {
                sumOnes++;
            }
        }
        System.out.println("Tails and eagles game");
        System.out.println(sumZeros + " are tails in 2000 takes");
        System.out.println(sumOnes + " are eagles in 2000 takes");
    }
}
