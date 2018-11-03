package com.hillel.task5;

public class SeasonCheckWithIfElse {
    public static void seasonsIfElse (int a) {

        System.out.println();

        if (a >= 1 & a <= 2) {
            System.out.println("Winter is already here");
              System.out.println();
              return;
        } else if (a >=3 & a <= 5) {
            System.out.println("It is Spring");
              System.out.println();
            return;
        } else if (a >= 6 & a <= 8) {
            System.out.println("It is Summer");
              System.out.println();
            return;
        } else if (a >= 9 & a <= 11) {
            System.out.println("Winter is close...");
              System.out.println();
            return;
        } else System.out.println("Winter is already here");
    }
}
