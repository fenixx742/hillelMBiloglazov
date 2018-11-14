package com.hillel.Utils;

public class ArraysGeneratorInt {
    public static int [] initializeGenerator(int arraySize) {
        int [] randomNumsArray = new int[arraySize];
        for (int i = 0; i < randomNumsArray.length; i++) {

            randomNumsArray [i] = RandomNumsUniversal.randomNums(0,30);
            
        }
        return randomNumsArray;
    }
}
