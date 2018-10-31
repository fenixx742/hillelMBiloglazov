package com.hillel.task4;

public class MainCalculations {
    public static void main (String args[]) {
        System.out.println("2240 UAH is " + UahToUsdConv.usDollarsConv(28.5, 2240) + " dollars"); // Converter

        System.out.println(SummationNums.sumNum(123) + " is summation of 123"); // three numbers summation

        System.out.println();

        System.out.println("<>Garden calculation<>");

        System.out.println("Fence needed for garden is " + ZaborGazonCalc.perimCalc(2,4) + " meters");

        System.out.println("Garden grass needed  " + ZaborGazonCalc.gardenCalSqr(2,4) + " m2");

        System.out.println();

        System.out.println("<>Train Collision Check<>");

        TrainsCollision.trains(50, 61);
    }
}
