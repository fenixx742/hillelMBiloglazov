package com.hillel.practice0411;

import com.hillel.Utils.MathRandomNums;
import com.hillel.Utils.Scaner;

public class Main {

    public static void main(String args[]) {

        System.out.println("Random nums");

        double d1 = (int)(Math.random() * 10 + 4);
        double d2 = (int) (Math.random() * 10 - 5);
        double d3 = (double)(Math.random());

        System.out.println(MathRandomNums.getRandomNums(-3, 3));

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        //Input methods in console
//        System.out.println("введите ваш возраст");
//
//        int year = Scaner.inputScannerInts();
//
//        System.out.println("ваш возраст:  " + year);

        // Cycles

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }


    }
}
