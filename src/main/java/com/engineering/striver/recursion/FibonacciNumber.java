package com.engineering.striver.recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = ScannerProvider.scanner().nextInt();

        System.out.println(nthFibonacciNumber(n));
    }

    private static int nthFibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
    }
}
