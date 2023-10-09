package com.engineering.leetcode;

public class Pattern132_30 {
    public static void main(String[] args) {
        int[] array = {3, 1, 4, 2};
        int n = array.length;

        is132Pattern(array, n);
    }

    private static boolean is132Pattern(int[] array, int n) {
        if (n < 3) return false;

        for (int i = 0; i < n-2; i++) {
        }
        return true;
    }
}
