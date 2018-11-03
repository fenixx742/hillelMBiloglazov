package com.hillel.task5;

public class MainTask5 {
    public static void main (String args[]) {
        SeasonCheckWithIfElse.seasonsIfElse(9);
        SeasonCheckBySwitch.seasonsSwitch(9);

        System.out.println();

        System.out.println("<>Bitwise Ops<>");

        long x = BitwiseOps.bitDivByFour(32);
        System.out.println(x);
    }
}
