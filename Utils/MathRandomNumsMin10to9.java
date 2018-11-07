package com.hillel.Utils;

public class MathRandomNumsMin10to9 {
    public static int getRandomNums(int min, int max) {
        return (int) (Math.random() * (max - min) - 11);
    }
}
