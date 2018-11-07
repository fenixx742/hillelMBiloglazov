package com.hillel.lesson42810;

public class CalcMeth2 {
    public static void bitWiseOps() {
        int i = 7;
        int result = i & 1;
        System.out.println(result);
    }


    public static void isEvenNum(int i) {
        int result = i & 1;
        if (result == 0)
        System.out.println(i + " 100 is even");
         else {
            if (result != 0)
                System.out.println(i + " is odd");
             else System.out.println("error occured");
        }
    }


    public static int shiftRigth(int num, int x) {
        //int result = num >> x;  // shifting right in bits
        //return result;
        return num >> x; // shorter version
    }

    public static void getDicision (int d) {
        int answer = -1;
        if(d > 0) {
            answer = 3;
        } else if (d < 0) {
            answer = 1;
        } else {
            answer = 0;
        }

        switch (answer) {
            case 3:
                int x = 100;
                System.out.println("This var sugessts " + x + " decisions");
                break;

            case 2:
                int y = 50;
                System.out.println("This var sugessts " + y + " decisions");
                break;

            case 1:
                int z = 10;
                System.out.println("This var sugessts " + z + " decisions");
                break;
                default:
                    System.out.println("No decisions");
        }

    }
}

