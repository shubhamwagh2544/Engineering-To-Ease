package com.engineering.leetcode.xtra;

public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;

        reverseStringII(s, k);
    }

    private static void reverseStringII(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n; i += 2*k) {
            int start = i;
            int end = Math.min(i+k-1, n-1);
            getItReversed(arr, start, end);
        }

        System.out.println(new String(arr));
    }

    private static void getItReversed(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
}
