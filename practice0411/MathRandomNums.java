package com.hillel.practice0411;

public class MathRandomNums {

    // random nums range viewer enter min and max numbers and get magic

    public static int getRandomNums(int min, int max) {

        return (int) (Math.random() * (min - max + 1)) + min;
    }
}
