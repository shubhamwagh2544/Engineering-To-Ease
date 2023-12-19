package com.engineering.leetcode;

public class LargestThreeDigitNumber {

    public static String largestGoodInteger(String num) {
        int cnt = 0;
        int number = -1;
        int ans = -1;

        for (int i = 0; i < num.length()-2; i++) {
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2)) {
                if (i == num.length() - 3) number = Integer.parseInt(num.substring(i));
                else number = Integer.parseInt(num.substring(i, i + 3));
                }
                ans = Math.max(number, ans);
            }

            return ans == -1 ? "" : Integer.toString(ans);
    }
    public static void main(String[] args) {
        String num = "677713332";

        System.out.println(largestGoodInteger(num));
    }
}
