package com.hillel.task6;

public class StringsIndexCkeck {
    public static void textCheck () {
        int ch = 'о';
        int i;
        String inStr = "Одесса мой родной город";
        System.out.println(inStr);

        for (i = 0; i <= inStr.length(); i++) {
            if (inStr.charAt(i) == ch) {
                System.out.println(i + " this is position of char 'o' ");
            }
            else ;
        }
    }
}
