package com.engineering.gfgcontest.contest115;

//Link : https://practice.geeksforgeeks.org/contest/gfg-weekly-coding-contest-115/problems

public class StringMatching {
    public static void main(String[] args) {
        String[] words = {"cdd", "zba", "dgf", "xyz", "mnp"};

        findTheMinimumDifference(words, words.length);
    }

    private static void findTheMinimumDifference(String[] words, int length) {
        int minimumDifference = Integer.MAX_VALUE;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                String s1 = words[i];
                String s2 = words[j];

                int wordLength = s1.length();
                int result = 0;
                for (int k = 0; k < wordLength; k++) {
                    result += Math.abs((int)s1.charAt(k) - (int)s2.charAt(k));
                }
                minimumDifference = Math.min(minimumDifference, result);
            }
        }
        System.out.println(minimumDifference);
    }
}
