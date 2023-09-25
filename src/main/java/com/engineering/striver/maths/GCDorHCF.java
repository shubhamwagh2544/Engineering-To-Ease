package com.engineering.striver.maths;

public class GCDorHCF {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        brute(x, y);

        better(x, y);

        betterAnother(x, y);

        optimal(x, y);
    }

    private static void optimal(int x, int y) {
        //Euclidean Algorithm :> [gcd(a, b) = gcd(a%b, b) where a>b]
        if (x == 0) {
            System.out.println(y);
            return;
        }

        if (y > x) {
            int temp = x;
            x = y;
            y = temp;
        }

        optimal(x % y, y);
    }

    private static void betterAnother(int x, int y) {
        //Euclidean Algorithm :> [gcd(a, b) = gcd(a-b, b) where a>b]
        if (x == 0) {
            System.out.println(y);
            return;
        }

        if (y > x) {
            int temp = x;
            x = y;
            y = temp;
        }

        betterAnother(x-y, y);
    }

    private static void better(int x, int y) {
        int min = x < y ? x : y;
        int gcd = 0;

        for (int i = min; i >= 1; i--) {            //better time complexity
            if ((x % i == 0) && (y % i == 0)) {
                gcd = i;
                break;
            }
        }

        System.out.println(gcd);
    }

    private static void brute(int x, int y) {
        int min = x < y ? x : y;
        int gcd = 1;

        for (int i = 1; i <= min; i++) {
            if ((x % i == 0) && (y % i == 0)) {
                gcd = i;
            }
        }

        System.out.println(gcd);
    }
}
