package com.hillel.task8;
import com.hillel.Utils.Scaner;

public class Factor {
    public  static void getFactorial () {

        System.out.println("input number you want to calculate ");
        int fact = 1;
        int i;
        int input = Scaner.inputScannerInts();


        System.out.println();

        for (i = 1; i <= input; i++) {

            fact *= i;

        }
        System.out.println("factorial of " + input + " is " + fact );
    }
}
