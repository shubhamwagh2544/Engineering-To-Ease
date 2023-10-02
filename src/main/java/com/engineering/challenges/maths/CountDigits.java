package com.engineering.challenges.maths;

public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;

        countDigits1(n);

        countDigits2(n);

        countDigits3(n);
    }

    private static void countDigits3(int n) {
        int length = (int) Math.floor(Math.log10(n) + 1);

        System.out.println(length);
    }

    private static void countDigits2(int n) {
        String s = String.valueOf(n);

        System.out.println(s.length());
    }

    private static void countDigits1(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }

        System.out.println(count);
    }
}
