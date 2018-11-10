package com.hillel.task7;

import com.hillel.Utils.RandomNumsUniversal;
import com.hillel.Utils.Scaner;

public class GuessGame2 {
    public static void getRandomNumAndGuess() {
        int i = 0;
        int randomNum =  RandomNumsUniversal.randomNums(1, 10);
        System.out.println("я загадал число... какое? введи ниже ");

        while (i <= 1) {

            int input =  Scaner.inputScannerInts();
                if (input < randomNum) {
                    System.out.println("я загадал больше повтори ввод " );
                } else if (input > randomNum) {
                    System.out.println(" я загадал меньше повтори ввод " );
                } else System.out.println(" верно это " + randomNum);
        }
    }
}

