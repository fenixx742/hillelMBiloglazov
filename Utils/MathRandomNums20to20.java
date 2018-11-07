package com.hillel.Utils;

public class MathRandomNums20to20 {
    public static int getRandomNums(int min, int max) {
        return (int) (Math.random() * (max - min) - 20);
    }
}
