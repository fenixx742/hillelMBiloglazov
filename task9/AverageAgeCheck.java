package com.hillel.task9;

public class AverageAgeCheck {
    public static void getCheck (double a, double b) {

        if (a > b) {
            System.out.println("Team 1 is older then Team 2");
        } else if (a < b) {
            System.out.println("Team 2 is older then Team 1");
        } else System.out.println("Average age is equal");
    }
}
