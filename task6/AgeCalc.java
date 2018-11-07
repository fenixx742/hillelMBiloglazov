package com.hillel.task6;

import com.hillel.Utils.Scaner;

public class AgeCalc {
    public static int birthYearInput () {
        int birthYear = Scaner.inputScannerInts();
        int curretnYear = 2018;
        int age = curretnYear - birthYear;
        System.out.println("Yours age is : ");
        return age;
    }
}
