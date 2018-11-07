package com.hillel.task6;

public class BitwiseViewPrintOut {
    public static void bitLookMethod () {
            for (int j = 0; j < 5 ; j++) {
                for (int i = 0; i < 5; i++) {
                    if (j == i) {
                        System.out.print(1);
                        continue;
                    } else
                        System.out.print(0);
                } System.out.println();
          }
     }
}
