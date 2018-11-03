package com.hillel.task4;

public class Discriminant {
    public static void discrimCoefCalc(int a, int b, int c) {

        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

            System.out.println();

        double discrimCoeffResult = ((b ^ 2) - (4 * a * c));

        if (discrimCoeffResult > 0) {
            double x1 = (-b + Math.sqrt(discrimCoeffResult)) / 2 * a;
            double x2 = (-b - Math.sqrt(discrimCoeffResult)) / 2 * a;
            System.out.println("x1 is " + x1 + " x2 is " + x2 +" becouse D > 0");
            return;
        }
         else if (discrimCoeffResult == 0) {
             double x1andx2 = (- b / (2 * a)) ;
            System.out.println("x1 and x2 is " + x1andx2 + " becouse D = 0");
            return;
        }
         else System.out.println("D < 0 no results");
    }
}
