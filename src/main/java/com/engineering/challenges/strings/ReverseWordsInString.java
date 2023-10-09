package com.engineering.challenges.strings;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = "   hello world   my dear friend   ";        //output: friend dear my world hello

        reverse_1(s, s.length());
    }

    private static void reverse_1(String s, int length) {
        /*
        int i = 0;
        int j = s.length()-1;

        while (s.charAt(i) == ' ' && i < j) i++;
        while (s.charAt(j) == ' ' && j > 0) j--;

        s = s.substring(i, j+1);
        */

        String[] split = s.trim().split("\\s+");

        StringBuilder str = new StringBuilder();
        for (int ind = split.length-1; ind >= 0; ind--) {
            str.append(split[ind]).append(" ");
        }

        System.out.println(str.toString().trim());
    }
}
