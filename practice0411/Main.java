package com.hillel.practice0411;

import com.hillel.Utils.ForLoop;
import com.hillel.Utils.MathRandomNums0to1;

public class Main {

    public static void main(String args[]) {

        System.out.println("Random nums");

        double d1 = (int)(Math.random() * 10 + 4);
        double d2 = (int) (Math.random() * 10 - 5);
        double d3 = (double)(Math.random());


        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

         //Input methods in console
        /*System.out.println("введите ваш возраст");

        int year = Scaner.inputScannerInts();

        System.out.println("ваш возраст:  " + year);*/

         /*Cycles and increments*/

        ForLoop.loop(1,9);

        System.out.println();

        String lang = "english, 106";
         int x = lang.length();
          for( int i = 0; i < x; i++) {
            System.out.print(lang.charAt(i) + " is " + i + " " + " | ");
          }

        System.out.println(lang + " is " + x +  " symbols");



    }
}
