package com.hillel.task7;
import com.hillel.Utils.Scaner;
import com.hillel.Utils.RandomNumsUniversal;

public class GuessGame {
    public static void getRandomNumAndGuess() {
        int i = 0;
        while (i < 1) {
            do {

                System.out.println("я загадал число... какое? введи ниже ");

            }
            while (i < 0);
            {
                int input = Scaner.inputScannerInts();
                int randomNum = RandomNumsUniversal.randomNums(0, 11);
                if (randomNum == input) {
                    System.out.println("прально, я загадал " + input);
                } else System.out.println("нет это не " + input + " попробуй еще раз") ;
            }
        }
    }
}