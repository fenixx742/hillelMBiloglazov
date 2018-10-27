package com.hillel.task2;

public class CalcMethods {

    public static int MethSimple (int a, int b, int c) {
        int result = a + b * (c / 2);
        return result;
    }
    public static int MethMod (int a, int b) {
        int result = (a ^ 2 + b ^ 2) % 2;
        return result;
    }
    public static int MethMoreMod (int a, int b, int c) {
        int result = ((a + b) / (12 * c)) % 4 + b;
        return result;
    }
    public static int MethMoreMoreMod (int a, int b, int c) {
        int result = ((a - b * c) / (a + b)) % c;
        return result;
    }
}
