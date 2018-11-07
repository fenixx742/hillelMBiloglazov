package com.hillel.practice0711;

import com.hillel.Utils.RandomNumsUniversal;

public class Main0711 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 0; i < 50; i++) {
            int x = RandomNumsUniversal.randomNums(0,20);
            System.out.println(x);
        }
    }
}
