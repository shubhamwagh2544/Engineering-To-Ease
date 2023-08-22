package com.engineering.striver.recursion;

public class PrintNto1Linear {
    public static void main(String[] args) {
        int N = ScannerProvider.scanner().nextInt();
        print1Nto1Linear(N, 1);
    }

    private static void print1Nto1Linear(int n, int i) {
        if (n < i) {
            return;
        }
        System.out.print(n+" ");
        print1Nto1Linear(n-1, i);
    }
}
