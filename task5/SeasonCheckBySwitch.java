package com.hillel.task5;

public class SeasonCheckBySwitch {
    public static void seasonsSwitch (int a) {

        System.out.println();

        switch (a) {
            case 1:
            case 2:
            case 12:
                System.out.println("It is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It is Autumn");
                break;
            default:
                System.out.println("Error Error");
        }
    }
}
