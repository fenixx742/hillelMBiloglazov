package com.hillel.task9;
import com.hillel.Utils.RandomNumsUniversal;

public class TeamsGenerator {
    public static int [] getAges(int quanttyOfPlayers) {
        int [] randomAges = new int[quanttyOfPlayers];
        for (int i = 0; i < randomAges.length; i++) {

            randomAges [i] = RandomNumsUniversal.randomNums(10,99);
            
        }
        return randomAges;
    }
}
