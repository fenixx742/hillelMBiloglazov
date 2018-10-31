package com.hillel.task4;

public class TrainsCollision {
    public static void trains (int v1, int v2) {
        int trainDist1 = 4;
        int trainDist2 = 6;
        double trainTime1 = trainDist1 / v1;
        double trainTime2 = trainDist2 / v2;
         if (trainTime1 == trainTime2)
             System.out.println("Collision will occure on 4 km trip");
         else System.out.println("Collision will never happen");

        System.out.println();

        System.out.print("Collision is ");
        System.out.print(v1 == v2);
        System.out.print(" if both trains will proceed 5 km and even speed");


    }
}
