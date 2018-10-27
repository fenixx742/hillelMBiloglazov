package com.hillel.task1;


public class CalcStarter {
    public static void main (String[] args) {
         int a = MainCalc.add(5,7);
           System.out.println("5 add 7 = " + a);
         int b = MainCalc.sub( 100,35);
           System.out.println("100 minus 35 = " + b);
         int c = MainCalc.div(200,50);
           System.out.println("200 div by 50 is " + c);
         int d = MainCalc.mult(33,3);
           System.out.println("33 mult by 3 = " + d);
        double e = MainCalc.add(5.1,7.1);
          System.out.println("5 add 7 = " + e);
        double f = MainCalc.sub( 100D,35D);
          System.out.println("100 minus 35 = " + f);
        double g = MainCalc.div(200D,50D);
          System.out.println("200 div by 50 is " + g);
        double j = MainCalc.mult(33.56,3.32);
          System.out.println("33 mult by 3 = " + j);
    }
}
