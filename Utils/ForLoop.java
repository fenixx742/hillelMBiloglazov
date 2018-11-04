package com.hillel.Utils;

public class ForLoop {
    public static void loop(int min, int max) {

        for (int x = min; x <= max; x++) {

            for (int y = min; y <= max; y++) {
                //System.out.print(x * y + " ");
                System.out.print(x + " * " + y + " = " + x * y + "  ");
            }
            System.out.println();
        }
    }
}
