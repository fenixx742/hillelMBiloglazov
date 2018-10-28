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
        System.out.println(result + " 100 is even");
         else {
            if (result != 0)
                System.out.println(result + " is odd");
             else System.out.println("error occured");
        }

    }
    public static int shiftRigth(int num, int x) {
        //int result = num >> x;  // shifting right in bits
        //return result;
        return num >> x; // shorter version
    }
}

