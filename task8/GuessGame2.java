package com.hillel.task8;

import com.hillel.Utils.RandomNumsUniversal;
import com.hillel.Utils.Scaner;

public class GuessGame2 {
    public static void getRandomNumAndGuess() {
        int randomNum =  RandomNumsUniversal.randomNums(1, 10);
        System.out.println("Я загадал число... какое? введи ниже ");

        while (true) {

            int input =  Scaner.inputScannerInts();

                if (input > randomNum) {
                    System.out.println(" Я загадал МЕНЬШЕ, попробуй еще раз");
                } else if (input < randomNum) {
                    System.out.println(" Я загадал БОЛЬШЕ, попробуй еще раз");
                } else break;
        } System.out.println(" Правильно, я загадал " + randomNum);
    }
}

