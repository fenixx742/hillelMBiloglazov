package com.hillel.task6;
import com.hillel.Utils.MathRandomNums;

public class EaglesAndTails {
    public static void randomCalc() {
        for (int i = 0; i <= 2000 ; i++) {
            int check = MathRandomNums.getRandomNums(0,1);
            switch (check) {
                case 0:
                    int zeroCounter = 1;
                    zeroCounter ++;
                    System.out.println(zeroCounter);
                case 1:
                    int oneCounter = 1;
                    oneCounter ++;
                    System.out.println(oneCounter);

                default:
                    System.out.println(" ");
            }


            /*if (check == 0) {
                int counterOf0 = 0;
                counterOf0 = counterOf0 + 1;
                System.out.println(counterOf0);
            }
            else if (check == 1) {
                int counterOnes = 0;
                counterOnes = counterOnes +1;
                System.out.println(counterOnes);
            } else continue;*/
            //System.out.println(check);
        }
    }
}
