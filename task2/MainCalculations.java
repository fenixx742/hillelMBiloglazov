package com.hillel.task2;

public class MainCalculations {
   public static void main (String args[]) {
        int a = CalcMethods.MethSimple(2,3,4);
          System.out.println("2 + 3 * ( 4 / 2 ) is " + a);

        int b = CalcMethods.MethMod(3,8);
          System.out.println("( 3^2 + 8^2 ) % 2" + b);

        int c = CalcMethods.MethMoreMod(3,6,4);
          System.out.println("( 3 + 6 ) / 12 * 4 % 4 + 6 is " + c);

        int d = CalcMethods.MethMoreMoreMod(4,2,5);
          System.out.println("((5 - 8 * 5 ) / ( 5 + 8 )) % 5 is " + d);
  }
}
