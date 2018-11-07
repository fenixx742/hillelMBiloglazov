package com.hillel.task6;

public class Loop100Summ {
    public static void loopForSumm (int min, int max) {
        int sum = 0;
            for (int i = min; i <= max; i++) {
                  sum += i;
            }
        System.out.println("Sum of numberts from 1 to 100 is " + sum);
      }
}
