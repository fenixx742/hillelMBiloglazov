package com.hillel.task4;

public class UahToUsdConv {
    public static double usDollarsConv (double exchangeRate, double howMuchUah) {
        double resultUSD = howMuchUah / exchangeRate;
        return resultUSD;
    }
}
