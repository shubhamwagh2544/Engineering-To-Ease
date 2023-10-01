package com.engineering.leetcode.xtra;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "Test1ng-Leet=code-Q!";

        reverseOnlyLetters(s);
    }

    private static void reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            if (!Character.isLetter(arr[start])) {
                start++;
                continue;
            }
            if (!Character.isLetter(arr[end])) {
                end--;
                continue;
            }
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }

        System.out.println(new String(arr));
    }
}
