package com.engineering.challenges.recursion;

import com.engineering.tryout.ScannerProvider;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        System.out.println(nthFibonacciNumberUsingRecursion(n));
        nthFibonacciNumberUsingLoop(n);
    }

    private static void nthFibonacciNumberUsingLoop(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first+ " " + second+ " ");

        int third = 0;
        for (int i = 2; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third+ " ");
        }
    }

    private static int nthFibonacciNumberUsingRecursion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibonacciNumberUsingRecursion(n-1) +
                nthFibonacciNumberUsingRecursion(n-2);
    }
}
