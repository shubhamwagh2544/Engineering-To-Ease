package com.engineering.challenges.maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 1221;

        //TC : O(N + LogN)
        palindromeOrNot(n);

        //TC : O(LogN)
        palindromeOrNotAnother(n);

        //TC : O(LogN)
        palindromeOrNotAnother1(n);
    }

    private static void palindromeOrNotAnother1(int n) {
        //edge case
        if ((n < 0) || (n != 0 && n % 10 == 0)) {
            System.out.println("Not");
        }

        int reversed = 0;

        while (n > reversed) {            //(LogN/2)
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }

        if ((n == reversed/10) || (n == reversed)) System.out.println("Palindrome");
        else System.out.println("Not");
    }

    private static void palindromeOrNotAnother(int n) {
        //edge case
        if ((n < 0) || (n != 0 && n % 10 == 0)) {
            System.out.println("Not");
        }

        int reversed = 0;
        int dummy = n;
        while (n != 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }

        if (reversed == dummy) System.out.println("Palindrome");
        else System.out.println("Not");
    }

    private static void palindromeOrNot(int n) {
        //edge case
        if ((n < 0) || (n != 0 && n % 10 == 0)) {
            System.out.println("Not");
        }

        String s = String.valueOf(n);               //LogN

        int i = 0;
        while (i < s.length()/2) {                  //N
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                System.out.println("Not");
                return;
            }
            i++;
        }

        System.out.println("Palindrome");
    }
}
