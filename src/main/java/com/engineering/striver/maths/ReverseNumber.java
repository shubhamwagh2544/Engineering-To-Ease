package com.engineering.striver.maths;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;

        reverseNumber(n);

        reverseNumberAnother(n);
    }

    private static void reverseNumberAnother(int n) {
        StringBuilder s = new StringBuilder(String.valueOf(n));
        s.reverse();

        System.out.println(s);
    }

    private static void reverseNumber(int n) {
        int reversed = 0;

        while (n != 0) {
            int rem = n % 10;
            reversed = reversed * 10 + rem;
            n = n / 10;
        }

        System.out.println(n < 0 ? -reversed : reversed);
    }
}
