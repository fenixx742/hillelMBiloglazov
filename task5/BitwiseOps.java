package com.hillel.task5;

public class BitwiseOps {
    public static long bitDivByFour(double number) {
        long result = (byte) number >> 2;
        return result;
    }
}
