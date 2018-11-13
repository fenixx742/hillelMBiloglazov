package com.hillel.task9;

import com.hillel.Utils.ShowArray;

public class ChangeChars {
    public static char[] getChangeIndex1(char[] c, int index1, int index2) {
        char[] updatedArray = new char[c.length];

        for (int i = 0; i < c.length; i++) {
            updatedArray[i] = c[i];
            if (c[i] == c[index1]) {
                updatedArray[i] = c[index2];
            } else if (c[i] == c[index2]) {
                updatedArray[i] = c[index1];
            }
        } return updatedArray;
    }
}
