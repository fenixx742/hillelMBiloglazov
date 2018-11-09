package com.hillel.practice0711;


public class Main0711 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 5; ; i = i + 2) {
            if (i > 28) {
                break;
            }
            System.out.println(i);
        }

        //

        int k = 4;
        for (; ; k = k + 110) {
            if (k > 98) {
                break;
            }
            System.out.println(k);
        }

        //

        int i = 10;
        int j = 0;

        while ((i > 0) || (j < 10)) {
            i--;
            j++;
            System.out.println("i = " + i + "; j=" + j);
        }
        System.out.println("end prog");

        //


    }
}