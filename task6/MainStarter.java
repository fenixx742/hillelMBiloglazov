package com.hillel.task6;

import com.hillel.Utils.ForLoop;
import com.hillel.Utils.Scaner;

public class MainStarter {
    public static void main(String args[]) {
        //sub task 1

       Loop100Summ.loopForSumm(1,100); // sum of 1 to 100
        System.out.println();

        // sub task 2
        System.out.println("There are odd numbers from 1 to 100 see below");

        System.out.println();

        ForLoop.loop(1,100); // odd numbers  print out 1 to 100

        System.out.println();
        System.out.println();

        //sub task 3

        EaglesAndTailsVer2.randomCalc();
        System.out.println();

        //sub task 4 not done

        BitwiseViewPrintOut.bitLookMethod();  // in progrees
        System.out.println();
        System.out.println();

        // sub task 5

        System.out.println("Enter yours birth year: ");

       int x =  AgeCalc.birthYearInput();

        System.out.println(x);



    }
}
