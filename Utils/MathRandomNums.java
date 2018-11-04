package com.hillel.Utils;

public class MathRandomNums {
    public static int getRandomNums(int min, int max) {
        return (int) (Math.random() * (min - max + 1));
    }
}
