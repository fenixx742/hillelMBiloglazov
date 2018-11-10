package com.hillel.task7;


public class ArrayMinMaxNums {
    public static void getMinMaxFind() {
        int min = 0, max = 0;
        int[] aIntNums = {-10, 20, 34, -11, 100, 20};
        double[] aDoubleNums = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};

        for (int i = 0; i < aIntNums.length; i++) {
            for (int x = 0; x < aIntNums.length; i++) {
                if (aIntNums[x] > aIntNums[i]) {
                    System.out.println(" minimum of INT Array " + aIntNums[i]);
                } break;
            }
        }
//        for (int i = 0; i < aDoubleNums.length; i++) {
//            for (int j = 0; j < aDoubleNums.length; j++) {
//                if (aDoubleNums[j] < aDoubleNums [i]) {
//                    System.out.println("maximum is " + aDoubleNums[i]);
//                } break;
//            }
//        }
    }
}

