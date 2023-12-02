package com.engineering.leetcode;

public class StringArraysEquality {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        //slow
        System.out.println(checkIfStringEqual(word1, word2));

        //fast
        System.out.println(checkIfStringEqual2(word1, word2));
    }

    private static boolean checkIfStringEqual2(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (String word : word1) {
            str1.append(word);
        }

        for (String word : word2) {
            str2.append(word);
        }

        //return str1.toString().contentEquals(str2);
        return str1.toString().equals(str2.toString());
    }

    private static boolean checkIfStringEqual(String[] word1, String[] word2) {
        String str1 = "";
        for (int i = 0; i < word1.length; i++) {
            str1 += word1[i];                           //slow
        }

        String str2 = "";
        for (int i = 0; i < word2.length; i++) {
            str2 += word2[i];                           //slow
        }

        return str1.equals(str2);
    }
}
