package com.hillel.task9;
import com.hillel.Utils.ShowArray;

public class MainStarterrrrr {
    public static void main(String[] args) {
       // sub task 1
        int [] arraySummation = {1,2,3,4,5,-8,-7,-5,-4} ;
        int diff = SumDifference.getSumPlus(arraySummation) + SumDifference.getSumMinus(arraySummation);
        System.out.println("Difference between nums in array is  " + diff);
        System.out.println();

        // sub task 2
        System.out.println("This is old array");
        char [] arrChars = {'r', 'o', 'l', 'o', 'c'};
        ShowArray.showArray(arrChars);

       char [] updatedArrChars = ChangeChars.getChangeIndex1(arrChars,0,4) ;
        System.out.println("This is updated array");
        ShowArray.showArray(updatedArrChars);

       // sub task 3

        System.out.println();









    }
}
