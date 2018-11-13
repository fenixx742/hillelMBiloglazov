package com.hillel.task9;
import com.hillel.Utils.FindMinMax;
import com.hillel.Utils.ShowArrayChars;
import com.hillel.Utils.ShowArrayDoubles;

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
        ShowArrayChars.showArray(arrChars);

       char [] updatedArrChars = ChangeChars.getChangeIndex1(arrChars,0,4) ;
        System.out.println("This is updated array");
        ShowArrayChars.showArray(updatedArrChars);

       // sub task 3

        System.out.println();

        double [] arrDoubles = {2.1,3.5,-6.6,4.6,-3.5,-2.6,0.2};

        ShowArrayDoubles.showArray(arrDoubles);
        double [] updatedArrDoubles = ArrayMinMaxChange.getChange(arrDoubles);
        ShowArrayDoubles.showArray(updatedArrDoubles);








    }
}
