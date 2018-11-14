package com.hillel.task9;

import com.hillel.Utils.ShowArrayChars;
import com.hillel.Utils.ShowArrayDoubles;
import com.hillel.Utils.ArrayAverage;
import com.hillel.Utils.ShowArrayIntegers;
import com.hillel.Utils.ArraysGeneratorInt;
import com.hillel.Utils.ShowArray;

public class MainStarterTask9 {
    public static void main(String[] args) {

       // sub task 1

        int [] arraySummation = {1,2,3,4,5,-8,-7,-5,-4} ;
        int diff = SumDifference.getSumPlus(arraySummation) + SumDifference.getSumMinus(arraySummation);
        System.out.println("Difference between nums in array is  " + diff);
        System.out.println();

        // sub task 2

        System.out.println("This is old array");
        char [] arrChars = {'r', 'o', 'l', 'o', 'c'};
        ShowArrayChars.showArray(arrChars);

        char [] updatedArrChars = CharsSwapInArrays.getChangeIndexes(arrChars,0,4) ;
        System.out.println("This is updated array");
        ShowArrayChars.showArray(updatedArrChars);

       // sub task 3

        System.out.println();

        double [] arrDoubles = {2.13,3.533,-6.6,4.6,-3.5,-2.6,0.24};


        System.out.println("Original Array");
        ShowArrayDoubles.showArray(arrDoubles);
        double [] updatedArrDoubles = ArrayMinMaxChange.getChange(arrDoubles);
        System.out.println("Sorted Array");
        ShowArrayDoubles.showArray(updatedArrDoubles);

        // sub task 4

        System.out.println();

        int [] teamOne = TeamsGenerator.getAges(25);
        int [] teamTwo = TeamsGenerator.getAges(25);
        ShowArrayIntegers.showArray(teamOne);
        ShowArrayIntegers.showArray(teamTwo);

        double teamOneAverageAge = ArrayAverage.getArrayAverage(teamOne);
        double teamTwoAverageAge = ArrayAverage.getArrayAverage(teamTwo);
        System.out.println("Average age of team 1 is: " + teamOneAverageAge + " years");
        System.out.println("Average age of team 2 is: "+ teamTwoAverageAge + " years");

        AverageAgeCheck.getCheck(teamOneAverageAge,teamTwoAverageAge);

        //sub task 5

        System.out.println();

        int [] array = ArraysGeneratorInt.initializeGenerator(10);
        ShowArray.showArray(array);
        OppositeOrder.getOpposite(array);












    }
}
