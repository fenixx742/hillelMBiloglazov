package com.hillel.task2;

public class MainCalculations {
   public static void main (String args[]) {
        int a = CalcMethods.MethSimple(2,3,4);
          System.out.println("2 + 3 * ( 4 / 2 ) is " + a);

        int b = CalcMethods.MethMod(3,8);
          System.out.println("( 3^2 + 8^2 ) % 2 is " + b);

        int c = CalcMethods.MethMoreMod(100,40,4);
          System.out.println("( 100 + 40 ) / 12 * 4 % 4 + 40 is " + c);

        int d = CalcMethods.MethMoreMoreMod(4,25,5);
          System.out.println("(a - b * c ) / ( a + b ) % c is " + d);
  }
}
