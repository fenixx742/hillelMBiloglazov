package com.hillel.Utils;

public class ForLoop {
    public static void loop(int min, int max) {
        int x;
         for (x = min; x <= max; x++) {
             if (x % 2 != 0)
                 System.out.print(x);
              else System.out.print(" ");
         }
    }
}
