package com.engineering.leetcode;

public class ReverseWordsInStringIII_1 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";

        reverseStringIII(s);
    }

    private static void reverseStringIII(String s) {
        String[] array = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String el : array) {
            res.append(new StringBuilder(el).reverse()).append(" ");
        }

        String ans = res.toString().trim();
        System.out.println(ans);
    }
}
