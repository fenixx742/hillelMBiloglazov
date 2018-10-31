package com.hillel.task4;

import java.io.IOException;

public class SummationNums {
    public static int sumNum (int x) {
        int result;
        int a, b, c , d;
        a = x / 100;
        b = x % 10;
        c = x / 10;
        d = c % 10;
        result = a + b + d;
        return result;
    }
}
