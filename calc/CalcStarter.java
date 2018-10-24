package com.hillel.calc;


public class CalcStarter {
    public static void main (String[] args) {
         int a = MainCalc.add(2,1);
           System.out.println("2 add 1 = " + a);
         int b = MainCalc.sub(2,1);
           System.out.println("2 minus 1 = " + b);
         int c = MainCalc.mult(2,1);
           System.out.println("2 mult by 1 = " + c);
         int d = MainCalc.div(9,3);
           System.out.println("9 div by 3 = " + d);
           int e = MainCalc.pow(4);
           System.out.println("power of 4 is " + e);
         int f = MainCalc.mod(34,5 );
           System.out.println("34 mod is " + f);
    }
}
