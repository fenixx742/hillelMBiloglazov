package com.hillel.task8;
import com.hillel.Utils.Scaner;

public class Factor {
    public  static void getFactorial () {

        System.out.println("input number you want to calculate ");
        int fact = 0;
        int i = 0;
        int input = Scaner.inputScannerInts();


        System.out.println();

        for (i = 0; i < input; i++) {

            fact = i * (i+1);

        }
        System.out.println("factorial of " + input + " is " + fact );
    }
}
