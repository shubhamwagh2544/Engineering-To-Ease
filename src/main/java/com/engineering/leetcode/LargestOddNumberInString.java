package com.engineering.leetcode;

public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "52";
        biggestOdd(num, num.length());
    }

    private static void biggestOdd(String num, int length) {
        int i = 0;
        int max = 0;

        while (i < length) {
            max = Math.max(Integer.valueOf(num.substring(i, i+1)), max);
        }
        System.out.println(max);
    }
}
