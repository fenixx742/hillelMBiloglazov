package com.hillel.Utils;

public class MathRandomNums0to1 {
    public static int getRandomNums(int min, int max) {
        return (int) (Math.random() * (max - min + 1));
    }
}
