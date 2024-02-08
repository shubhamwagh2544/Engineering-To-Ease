package com.engineering.challenges.recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "asab";
        int start = 0;
        int end = str.length()-1;

        //two pointer
        //checkIfPalindrome1(start, end, str);

        //one pointer
        checkIfPalindrome2(start, end, str);
    }

    private static void checkIfPalindrome1(int start, int end, String str) {
        if (start > end) {
            System.out.println("Palindrome");
            return;
        }
        if (str.charAt(start) != str.charAt(end)) {
            System.out.println("Not Palindrome");
            return;
        }
        checkIfPalindrome1(start+1, end-1, str);
    }

    private static void checkIfPalindrome2(int start, int end, String str) {
        if (start > end/2) {
            System.out.println("Palindrome");
            return;
        }
        if (str.charAt(start) != str.charAt(end-start)) {       //one pointer
            System.out.println("Not Palindrome");
            return;
        }
        checkIfPalindrome2(start+1, end, str);
    }
}
