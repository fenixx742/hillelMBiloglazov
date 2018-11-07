package com.hillel.Utils;

public class RandomNumsUniversal {
    public static int randomNums (int min, int max) {
         return (int) (Math.random() * (max - min + 1) + min);
    }
}
